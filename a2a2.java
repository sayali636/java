class Fib
  {
    static void fib(int n)
     {
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < n; i++)
         {
            c = a + b;
            System.out.print(c+" ");
            a=b;b=c;
        }
    }
    public static void main(String[] args)
     {
        fib(10);
     }
}
