package university.instructor;

public class TestProblem6 {

    public static void main(String[] args){

        Subject s1 = new Subject("cs-101  "," introduction to java ");
        Subject s2 = new Subject("cs-106  ","Software engineering ");

        Instructor inst = new Instructor(
                "Alex",
                "Williams",
                "0678-1251230",
                "alex@gmail.com",
                " AB 123"
        );

        inst.addSubject(s1);
        inst.addSubject(s2);

        System.out.println("\n==INSTRUCTOR CARD==\n");
        System.out.println(inst.toCard());


        System.out.println("\n==SUBJECTS SYLLABUSLINE==\n");
        System.out.println(s1.syllabusLine());
        System.out.print("-------------------------\n");
        System.out.println(s2.syllabusLine());


        System.out.println("\n==IS INTRO COURSE ?==\n");
        System.out.println(s1+ "\nis intro course -> "+ s1.isIntroCourse());
        System.out.print("-------------------------\n");
        System.out.println(s2+ "\nis intro course -> "+ s2.isIntroCourse());


    }
}
