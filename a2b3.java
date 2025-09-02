import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double per;

    Student(int rollno, String name, double per) {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }

    public String toString() {
        return rollno + " " + name + " " + per;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student arr[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter rollno, name, percentage:");
            int r = sc.nextInt();
            String nm = sc.next();
            double pr = sc.nextDouble();
            arr[i] = new Student(r, nm, pr);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
