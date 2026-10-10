package student;

public class Test {
    public static void main(String[] args) {

        Major math = new Major("20", "Math");
        Major art = new Major("21", "Art");

        Student s1 = new Student(
                "Wissal",
                "Tilamsane",
                "0616-190877",
                "wissal@gmail.com",
                "R134567892"
        );

        Student s2 = new Student(
                "Rania",
                "Moujahed",
                "0644-342516",
                "raniia@gmail.com",
                "K4512639785",
                art
        );

        Student s3 = new Student(
                "Anass",
                "Mahdad",
                "0789-542701",
                "anass@gmail.com",
                "R5412887567",
                math
        );

        Student s4 = new Student(
                "Youssef",
                "Ouazzani",
                "0678-1251230",
                "youssef@gmail.com",
                "M4521639874"
        );

        System.out.println("\n==INITIAL DISPLAY OF MAJORS==\n");
        System.out.println(Student.cs);
        System.out.println("-----------------------------");
        System.out.println(art);
        System.out.println("-----------------------------");
        System.out.println(math);


        System.out.println("\n==DISPLAY CS STUDENTS==\n");
        Student.cs.displayStudents();

        System.out.println("\n==DISPLAY ART STUDENTS==\n");
        art.displayStudents();

        System.out.println("\n==DISPLAY MATH STUDENTS==\n");
        math.displayStudents();
//        for(int i =0 ; i<50 ; i++){
//            System.out.println("adding student "+ (i+1)+" :");
//            art.addStudent(new Student());
//        }

        System.out.println("\n==REMOVE A CS STUDENT BY CNE==\n");
        Student.cs.removeStudentByCNE("M4521639874");

        System.out.println("==DISPLAY CS STUDENTS==\n");
        Student.cs.displayStudents();

        System.out.println("\n==FINDING MATH STUDENT BY CNE==\n");
        System.out.println(math.findStudentByCNE("R5412887567"));


        System.out.println("==FINAL DISPLAY OF MAJORS==\n");
        System.out.println(Student.cs);
        System.out.println("-----------------------------");
        System.out.println(art);
        System.out.println("-----------------------------");
        System.out.println(math);
    }
}

