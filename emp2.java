import java.util.*;
class emp
{
    int eno;
String name;
float sal;
   void accept(int eno1,String name1,float sal1)
{
      eno=eno1;
      name=name1;
      sal=sal1;
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
       
ob.accept(33,"jay",300000);
ob.disp();
}

}