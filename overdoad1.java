class areaD
{
    void area(float r)
    {
      float a=3.14f*r*r;
     System.out.println("area of circle="+a);
    }
   void area(float h,float b)
    {
      float a=0.5f*b*h;
     System.out.println("area of triangle="+a);
    }
     void area(double l,double b)
    {
      double a=l*b;
     System.out.println("area of rectangle="+a);
    }
  public static void main(String arg[])
     {
       areaD ob=new areaD();
        ob.area(23.54f);
        ob.area(23.54f,3.4f);
        ob.area(2.4,4.5);
       



     }

}