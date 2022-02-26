import java.util.Scanner ;
class Student
{
Scanner sc= new Scanner (System.in);
String name;
int rollno ;
double marks, attendance;
public static void main ( String []args)
{
    Student s1= new Student ();
    Student s2= new Student();
    if (s1.attendance>75.0)
    s1.marks=1.1*s1.marks;
    if (s1.marks>100.0)
    s1.marks=100.0;
    if (s2.attendance>75.0)
    s2.marks=1.1*s2.marks;
    if (s2.marks>100.0)
    s2.marks=100.0;
    System.out.println ("THE STUDENT "+s1.name +" has got marks "+ s1.marks);
    System.out.println ("THE STUDENT "+s2.name +" has got marks "+ s2.marks);
}
Student()
{
    System.out.println("enter name ");
    name= sc.nextLine();
    System.out.println(" Enter roll no ");
    rollno= sc.nextInt();
    System.out.println("Enter marks");
    marks= sc.nextDouble();
    if (marks<=0.0)
    marks=0.0;
    System.out.println("Enter attendance");
    attendance=sc.nextDouble();

}
}
