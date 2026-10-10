package university.instructor;

import university.Person;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject[] subjects = new Subject[10];
    private int subjects_count = 0;

    public Instructor(){super();}

    public Instructor(String nom,
                      String prenom,
                      String telephone,
                      String email,
                      String employeeNumber){
        super(nom, prenom, telephone, email);
        this.employeeNumber = employeeNumber;

    }


    // getters

    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public Subject[] getSubjects(){
        return subjects;
    }

    //setters
    public void setEmployeeNumber(String num){
        employeeNumber = num;
    }

    // toString()
    @Override
    public String toString(){
        return super.toString()+String.format("\nEmployee number : %s\n",employeeNumber);
    }

    public void addSubject(Subject subject){
        if (subjects_count >= 10){
            System.out.println("This instructor has a full schedule");
        }
        else {
            subjects[subjects_count] = subject;
            subject.setInstructor(this);
            subjects_count++;
        }

    }

    public int findSubjectByCode(String code){
        for(int i = 0; i< subjects_count; i++){
            if(subjects[i].getCode().equals(code)) return i;
        }
        return -1;
    }

    public void removeSubject(Subject subject){
        int i = findSubjectByCode(subject.getCode());
        if(i!=-1){
            subjects_count--;
            subjects[i].setInstructor(null);
            if(i == 9){
                subjects[i]= null;
                return;
            }
            subjects[i]= subjects[subjects_count];
            subjects[subjects_count]=null;

        }
        else System.out.println("Subject not assigned");
    }

    public String cleanEmployeeNumber(){
        String num = new String(employeeNumber);
        return num.replace(" ","");
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s,"+
                " lastName=%s,"+
                " firstName=%s]",
                employeeNumber,this.getSecondName(),this.getFirstName()
                );
    }

    public String toCard(){
        StringBuilder card =new StringBuilder("Instructor\n----------\n");
        card.append("Employee #: ").append(cleanEmployeeNumber())
                .append("\nName : ").append(getFirstName()).append(" ").append(getSecondName())
                .append("\nEmail : ").append(getEmail())
                .append("\nPhone : ").append(getPhone());

        return card.toString();

    }

    public String displayName(){
        StringBuilder fullName = new StringBuilder("");

        if(this.getFirstName()!=null){
            fullName.append(this.getFirstName()+ " ");
        }
        if(this.getSecondName()!=null){
            fullName.append(this.getSecondName());
        }

        return fullName.toString();
    }



}
