//Week1 Day6 -Inheritance

class Person
{
 String name;
Person(String name)
{
  this.name=name;
}
void printName()
{
System.out.println("Name:" + name);
}
}

class Student extends Person
{
 int rollno;
Student(String name,int rollno)
{
super(name);
this.rollno=rollNo;
}
void printDetails()
{
printName();
System.out.println("Rollno:" + rollNo);
}
}

public class MainStudent{
public static void main(String[]args)
{
 Student s1=new Student("Anita",101);
 Student s2=new Student("Durga",102);
s1.printDetails();
s2.printDetails();
}
}