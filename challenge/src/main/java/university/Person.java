package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(){}

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email =email;
    }

    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getSecondName(){return secondName;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}

    // we are meant to keep track of ids by auto-incrementing them
    // defining a setter for id contradicts that purpose
    //public void setId(int id){this.id = id;}
    public void setFirstName(String fName){firstName= fName;}
    public void setSecondName(String sName){secondName = sName;}
    public void setPhone (String phone){this.phone = phone;}
    public void setEmail(String email){this.email = email;}

    @Override
    public String toString(){
        return String.format(
                "ID : %d" +
                "\nFirst Name : %s"+
                "\nSecond Name : %s"+
                "\nPhone : %s"+
                "\nEmail : %s",
                id, firstName,secondName,phone,email
        );
    }



}

