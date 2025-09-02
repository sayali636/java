class Copy
 {
    int x;
    Copy(int n) { x = n; }
    Copy(Copy c) { x = c.x; }

    public static void main(String[] args)
    {
        Copy a = new Copy(10);
        Copy b = new Copy(a);
        System.out.println(b.x);
    }
}
