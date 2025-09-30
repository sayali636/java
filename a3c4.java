// Derive a class Square from class Rectangle. Create one more class Circle. Create an 
//interface with only one method called area(). Implement this interface in all classes. 
//Include appropriate data members and constructors in all classes. Write a java
 //program to accept details of Square, Circle & Rectangle and display the area.

import java.util.*;
interface Shape 
{
    double area();
}

class Rectangle implements Shape 
{
    double length, breadth;

    Rectangle(double l, double b)
  {
        length = l;
        breadth = b;
    }
    public double area() 
 {
        return length * breadth;
    }
}
class Square extends Rectangle 
{
    Square(double side) 
 {
        super(side, side); 
    }
}

class Circle implements Shape 
{
    double radius;
    final double PI = 3.14159;

        Circle(double r) 
  {
        radius = r;
    }

        public double area() 
  {
        return PI * radius * radius;
    }
}
 class Main
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();
        Rectangle rectangle = new Rectangle(l, b);

        System.out.print("\nEnter side of Square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);

        System.out.print("\nEnter radius of Circle: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);

        System.out.println("\nAreas:");
        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Square Area = " + square.area());
        System.out.println("Circle Area = " + circle.area());

        sc.close();
    }
}
