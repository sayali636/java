//Create an abstract class Shape with methods calc_area() & calc_volume(). Derive 
//two classes Sphere(radius)& Cone(radius, height) from it. Calculate area and 
//volume of both. (Use Method Overriding) 

import java.util.*;
abstract class Shape 
{
    abstract double calc_area();
    abstract double calc_volume();
}
class Sphere extends Shape 
{
    double radius;
    final double PI = 3.14159;
     Sphere(double r) 
    {
        radius = r;
    }
    double calc_area() 
    {
        return 4 * PI * radius * radius; 
    }

    double calc_volume() 
    {
        return (4.0 / 3) * PI * radius * radius * radius; // volume
    }
}

class Cone extends Shape 
{
    double radius, height;
    final double PI = 3.14159;

    Cone(double r, double h)
   {
        radius = r;
        height = h;
    }

    double calc_area()
   {
        double slant = Math.sqrt(radius * radius + height * height); 
        return PI * radius * (radius + slant); // 
    }


    double calc_volume()
   {
        return (1.0 / 3) * PI * radius * radius * height; // volume
    }
}
 class Main
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Sphere: ");
        double r1 = sc.nextDouble();
        Sphere sphere = new Sphere(r1);

        System.out.println("Sphere Surface Area = " + sphere.calc_area());
        System.out.println("Sphere Volume = " + sphere.calc_volume());

       
        System.out.print("\nEnter radius of Cone: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter height of Cone: ");
        double h = sc.nextDouble();
        Cone cone = new Cone(r2, h);

        System.out.println("Cone Surface Area = " + cone.calc_area());
        System.out.println("Cone Volume = " + cone.calc_volume());

        sc.close();
    }
}
