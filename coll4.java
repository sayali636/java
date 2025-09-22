import java.util.*;
class demo
{
 public static void main(String arg[])
  {
    ArrayList a1=new ArrayList();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
     {
       System.out.println("Enter number");
        int num =sc.nextInt();
        a1.add(num);
     }
    Collections.reverse(a1);
    System.out.println(a1);

}
}