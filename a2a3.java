class Area
 {
    void find(double r)
    { 
        System.out.println("Circle: " + (3.14 * r * r));
    }
    void find(double b, double h)
    { 
        System.out.println("Triangle: " + (0.5 * b * h));
    }
    void find(int l, int w)
    { 
        System.out.println("Rectangle: " + (l * w));
    }
    public static void main(String[] args)
    {
        Area a = new Area();
        a.find(5.0);
        a.find(4.0, 6.0);
        a.find(4, 7);
    }
}
