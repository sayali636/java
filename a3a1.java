import java.util.Scanner;

class Student {
    int rno, mark1, mark2;
    String name;

    // Inner Class
    class Result {
        int total;
        double percentage;

        Result() {
            total = mark1 + mark2;
            percentage = total / 2.0;
        }

        void display() {
            System.out.println("Rno: " + rno);
            System.out.println("Name: " + name);
            System.out.println("Mark1: " + mark1);
            System.out.println("Mark2: " + mark2);
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rno, name, mark1, mark2:");
        int r = sc.nextInt();
        String nm = sc.next();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();

        Student s = new Student();
        s.rno = r;
        s.name = nm;
        s.mark1 = m1;
        s.mark2 = m2;

        Student.Result res = s.new Result();
        res.display();
    }
}
