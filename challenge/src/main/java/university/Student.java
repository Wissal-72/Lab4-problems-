package student;

public class Student extends Person {
    private String cne;
    private Major major;

    // we need a cs major to exist as a default Major
    // for the student constructor with no Major argument
    // it should also be accessed outside the class for manipulation
    // thus the public access modifier
    public static Major cs = new Major("23", "Computer Science") ;

    public Student(){
        super();
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
          super(nom, prenom, telephone, email);
          this.cne = cne;
          if(major.getStudentCount()<50) {
              major.addStudent(this);
              this.major = major;
          }
          else System.out.println("Major " + major.getName()+ " is full");

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
           // if we do new Major(...) we would create a new Major obj at every call
           this(nom,prenom, telephone , email , cne , cs) ;
    }

    // Getters
    public String getCne(){return cne;}
    public Major getMajor(){return major;}
    public String getFullNameFormated(){
        return String.format("%S , %s",this.getFirstName(), this.getSecondName());
    }

    // Setters
    public void setCne(String cne){this.cne = cne;}
    public void setMajor(Major major){this.major = major;}

    @Override
    public String toString(){
        return super.toString()+ String.format("\nCNE : %s\n" , cne);
    }

}

