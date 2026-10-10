package university.instructor;

public class Subject {
    private static int next_id=1;
    private int id;
    private String code;
    private String title;
    private Instructor instructor= null;

    public Subject(){}

    // a subject does not necessarily have an instructor when it is created
    public Subject( String code , String title){
        id = next_id++;
        this.code = code;
        this.title = title;
    }

    public Subject( String code , String title,Instructor instructor){
        id = next_id++;
        this.code = code;
        this.title = title;
        this.setInstructor(instructor);
    }

    //getters
    public int getId(){
        return  id;
    }
    public String getCode(){
        return code;
    }
    public String getTitle(){
        return title;
    }


    //setters
    public void setCode(String code){
        this.code = code;
    }

    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    //toString()
    @Override
    public String toString(){
        return String.format(
                "Subject ID : %d"+
                "\nTitle :  %s"+
                "\nCode :  %s ",
                id, title,code
        );
    }

    public String normalizedCode(){
        code.trim();
        return  String.format("%S", code);
    }

    public String properTitle(){
        String[] parts = title.trim().split(" ");
        for(String part: parts){
            part = part.substring(0, 1).toUpperCase() + part.substring(1);
        }

        return String.join(" ", parts);

    }

    public boolean isIntroCourse(){
        return title.toLowerCase().contains("intro");
    }

    public  String syllabusLine(){
        StringBuilder syllabus = new StringBuilder(normalizedCode());
        syllabus.append("-").append(properTitle()).append("(")
                .append(instructor.displayName()).append(")");

        return syllabus.toString();
    }

}
