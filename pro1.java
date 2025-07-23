//Accept Emp info from user and display...........
import java.util.*;
class Emp
{
  static public void main(String abc[])
  { 
      Scanner sc=new Scanner(System.in); 
    System.out.println("Enter Emp no:");
    int eno=sc.nextInt();
    System.out.println("Enter Emp name:");
    String ename=sc.next();
    System.out.printf("Enter Emp sal:");
    float sal=sc.nextFloat();
 
     System.out.printf("\nEmp no=%d",eno);
     System.out.printf("\nEmp name=%s",ename);
     System.out.printf("\nEmp sal=%f",sal);
  }
}