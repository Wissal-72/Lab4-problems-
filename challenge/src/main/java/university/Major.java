package student;

public class Major {
    private static int nextId = 1;
    private static int capacity =50;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;


    public Major(){
        studentCount = 0;
        students = new Student[50];
    }

    public Major(String code, String name) {
        id = nextId++;
        this.code = code;
        this.name = name;
        studentCount = 0;
        students = new Student[50];
    }



    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount<capacity){
            if(findStudentByCNE(s.getCne())==null) {
                if(s.getMajor()!=null) s.getMajor().removeStudentByCNE(s.getCne());
                students[studentCount] = s;
                studentCount++;
                s.setMajor(this);

            }
            else System.out.println("Student is already enrolled");
        }
        else System.out.println("Major is already full !!");
    }

    // Getters
    public int getId(){return id;}
    public String getCode(){return code;}
    public String getName(){return name;}
    public Student[] getStudents(){return students;}
    public int getStudentCount(){return studentCount;}

    //Setters

    // same remark about the id setter here as in class Person
    //public void setId(int id) {this.id = id;}
    public void setCode(String code) {this.code = code;}
    public void setName(String name) {this.name = name;}
    public void setStudents(Student[] students){
        if(students.length>50) {
            System.out.println("Error : Capacity exceeded");
            return;
        }

        studentCount = 0;
        for(int i =0 ; i < students.length ; i++){
            this.students[i]= students[i];
            studentCount++;
        }
    }
    //student counter should not have a setter to ensure it stays

     @Override
     public  String toString(){
        return String.format(
                "Major ID :%d"+
                "\nName : %s"+
                "\nCode : %s"+
                "\nNumber of enrollements : %d",
                id, name, code,studentCount
        );
     }
    // Display all students in the major
    public void displayStudents() {

        System.out.println("List of students enrolled in Major "+ name+" ("+ code+" ) :");
        for (Student student: students){
            if(student == null) break;
            System.out.println(student);
        }


    }

    // Finding student by CNE

    public Student findStudentByCNE(String cne){
        for(Student student : students){
            if(student == null) return null;
            if(student.getCne().equals(cne))
                return student;
        }

        return null;
    }

    //removing student by cne
    public boolean removeStudentByCNE(String cne){
        if(findStudentByCNE(cne)!= null) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getCne().equals(cne)) {
                    students[i].setMajor(null);
                    students[i] = students[studentCount - 1];
                    students[studentCount - 1] = null;
                    studentCount--;

                    return true;
                }
            }
        }
         return false;
    }

    public String getOccupancyRate(){
        double rate = (double) (studentCount/capacity)*100;
        return String.format(
                "%s capacity : %d"+
                "Current enrollements : %d"+
                "Occupancy rate : %.2f",
                capacity, studentCount, rate
        );
    }

    public String getStudentListAsString(){
        StringBuilder list = new StringBuilder("");
        for(Student student: students){
            list.append("\n"+ student);
        }

        return list.toString();
    }


}
