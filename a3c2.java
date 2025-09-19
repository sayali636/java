interface Shape {
    double area();
}

class Circle implements Shape {
    final double r;   // final variable
    Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
}

class Sphere implements Shape {
    final double r;
    Sphere(double r) { this.r = r; }
    public double area() { return 4 * Math.PI * r * r; }
}

class Main2 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape s = new Sphere(5);
        System.out.println("Circle Area = " + c.area());
        System.out.println("Sphere Area = " + s.area());
    }
}
