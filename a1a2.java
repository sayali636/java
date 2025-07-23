//Write a java Program to calculate the sum of first and last digit of a number
import java.util.*; 
class demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter digit");
    int n=sc.nextInt();
       int s=1;
       for(int i=1;i<n;i++)
        {
           for(int j=1;j<i;j++)
              {
                s=s+j;
                if(s==i)
                   System.out.printf("%d",i);  
        }
   }
}
}