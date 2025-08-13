import java.util.Scanner;
class Student
{
    int id;
    String name, course, batch;


    void display()
    {
        System.out.println("SAP id" +"\t"+ id);
        System.out.println("NAME" +"\t" + name);
        System.out.println("COURSE" +"\t" + course);
        System.out.println("BATCH" +"\t"+ batch);
    }
    void details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sapid");
        id = sc.nextInt();
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your course");    
        course = sc.next();
        System.out.println("Enter your batch");
        batch = sc.next();
    }
    public static void main(String args[])
    {
        Student mca= new Student();
        mca.details();
        mca.display();
    }

}