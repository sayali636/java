//Define an Interface Shape with abstract method area(). Write a java program to calculate 
//an area of Circle and Sphere.(use final keyword) 

interface Shape 
{
    double area();
}

class Circle implements Shape 
{
    final double PI = 3.14; 
    double radius;

    Circle(double r) 
    {
        radius = r;
    }

    public double area()
    {
        return PI * radius * radius;
    }
}

class Sphere implements Shape 
{
    final double PI = 3.14; 
    double radius;

    Sphere(double r) 
    {
        radius = r;
    }

    public double area() 
   {
        return 4 * PI * radius * radius;
    }
}

 class ShapeArea 
{
    public static void main(String[] args) 
   {
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());

        Sphere s = new Sphere(5);
        System.out.println("Surface Area of Sphere: " + s.area());
    }
}
