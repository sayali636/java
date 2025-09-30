//Define a class Student with attributes rollno and name. Define default and parameterized 
//constructor. Override the toString() method. Keep the count of Objects created. Create 
//objects using parameterized constructor and Display the object count after each object is 
//created.

class Student 
{
    int rollno;
    String name;
    static int count = 0;  
   
    Student()
   {
        rollno = 0;
        name = "Unknown";
        count++;
    }

    Student(int r, String n)
   {
        rollno = r;
        name = n;
        count++;
        System.out.println("Object Count: " + count);
    }

    public String toString() 
   {
        return "Roll No: " + rollno + ", Name: " + name;
    }
}

public class StudentTest 
{
    public static void main(String[] args)
     {
        Student s1 = new Student(101, "neha");
        System.out.println(s1);

        Student s2 = new Student(102, "tanuja");
        System.out.println(s2);

        Student s3 = new Student(103, "sayali");
        System.out.println(s3);
    }
}
  