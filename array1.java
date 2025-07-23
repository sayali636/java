import java.util.*;
class array
{
     public static void main(String arg[])
       { 
          Scanner sc=new Scanner(System.in);
            System.out.println("enter limit");
           int n=sc.nextInt();
          int a[]=new int[n];
           System.out.println("enter n numbers");
            for(int i=0;i<n;i++)
            {
               a[i]=sc.nextInt();
            }
          System.out.println("array=");
            for(int i=0;i<n;i++)
            {
             System.out.printf("%d\t",a[i]);  
            }

       }
}