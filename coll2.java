import java.util.*;
class demo
{
public static void main(String arg[])
{
 LinkedList a1=new LinkedList();
  a1.add(20);
  a1.add(30);
  a1.add(40);
  a1.add(50);
  a1.add(60);
System.out.println(a1);
a1.remove(4);
System.out.println(a1);
 ArrayList a2=new ArrayList();
 a2.add("fy");
 a2.add("sy");
 a2.add("ty");
System.out.println(a2);
a1.addAll(a2);
System.out.println(a2);
a1.clear();
System.out.println(a1);

 }
}