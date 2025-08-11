import java.io.*;
class Demo 
{
   public static void main(String arg[])
    {
      try
     {
         DataInputStream din=new DataInputStream(System.in);
         FileWriter f1=new FileWriter("abcd.txt");
         System.out.println("Enter strings");
          
             for(int i=0;i<4;i++)
             {
                    String s=din.readLine();                 }
                  f1.write(s+"\n");
             }
           f1.close();
          System.out.println("file write succ......");         
     }catch(Exception e)
       {
         System.out.println("Error="+e);
       }
   }
}