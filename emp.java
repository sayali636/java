import java.util.*;
class emp
{
    int eno;
String name;
float sal;
   void accept()
{
       Scanner sc=new Scanner(System.in);
         System.out.printf("enter emp no");
           eno=sc.nextInt();
         System.out.printf("enter emp name");
          name=sc.next();
             
         System.out.printf("enter emp sal");
           sal=sc.nextFloat();
}
      void disp()
       {
         System.out.printf("\nemp no=%d",eno);
         System.out.printf("\nemp name=%s",name);
         System.out.printf("\nemp sal=%f",sal);
       }
public static void main(String arg[])
{
   emp ob=new emp();
ob.accept();
ob.disp();
}

}