final class Demo
{
    void j()
  {
      int a=10;
   System.out.println(a);
}
}
class a
{

 void disp()
 {
    System.out.println("hiii");
 }
}
class b extends a
{

 void disp1()
 {
    System.out.println("byy");
 }
}
class add
{
 public static void main(String ar[])
 {
b o=new b();
o.disp();
o.disp1();
Demo ob=new Demo();
ob.j();

 }
}