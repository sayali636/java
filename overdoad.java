class Demo
{
      void add(int a,int b)
       {
         int c=a+b;
       System.out.println("addition1="+c);    
       }
       void add(int a,int b,int d)
       {
         int c=a+b+d;
       System.out.println("addition2="+c);    
       }
       void add(int a,int b,int d,int e)
       {
         int c=a+b+d+e;
       System.out.println("addition3="+c);    
       }
       void add(float a,float b)
       {
         float c=a+b;
       System.out.println("addition4="+c);    
       }
    public static void main(String arg[])
     {
          Demo ob=new Demo();
          ob.add(22,33);
          ob.add(22,33,44);
          ob.add(22.2f,33.43f);
          ob.add(22,33,87,65);
         
     }

}