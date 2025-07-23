class emp
{
   public static void main(String args[])
    {
      int eno=Integer.parseInt(args[0]);
      String ename=args[1];
      float sal=Float.parseFloat(args[2]);

      System.out.printf("\n Emp no=%d",eno);
      System.out.printf("\n Emp name=%s",ename);
      System.out.printf("\n Emp sal=%f",sal);         
    }   
}