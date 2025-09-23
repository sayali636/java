import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee() {}   // default constructor

    Employee(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter Id: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Department: ");
        department = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void display()
    {
        System.out.println(id + " " + name + " " + department + " " + salary);
    }

    public double getSalary()
 {
        return salary;
    }
}

class Manager extends Employee
 {
    private double bonus;

    Manager()
    {
    }

    Manager(int id, String name, String department, double salary, double bonus)
 {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus + " Total Salary: " + (getSalary() + bonus));
    }

    public double totalSalary() {
        return getSalary() + bonus;
    }
}

public class TestEmployee
 {
    public static void main(String[] args)
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many managers? ");
        int n = sc.nextInt();
        Manager[] m = new Manager[n];

        for (int i = 0; i < n; i++)
        {
            m[i] = new Manager();
            m[i].accept(sc);
        }

        Manager max = m[0];
        for (int i = 1; i < n; i++)
        {
            if (m[i].totalSalary() > max.totalSalary())
            {
                max = m[i];
            }
        }
        System.out.println("\nManager with Maximum Salary:");
        max.display();
    }
}
