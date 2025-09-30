//Define a class Employee having private members-id, name, department, salary. 
//Define default & parameterized constructors. Create a subclass called Manager with 
//private member bonus. Define methods accept & display in both the classes. 
//Create n objects of the manager class & display the details of the manager having the maximum total salary(salary+bonus).
 
import java.util.*;
class Employee 
{
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee()
  {
        id = 0;
        name = "Unknown";
        department = "None";
        salary = 0;
    }
    Employee(int id, String name, String dept, double salary) 
{
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
    public void accept(Scanner sc)
 {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    public void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public double getSalary()
   {
        return salary;
    }
    public String getName()
  {
        return name;
    }
}

class Manager extends Employee 
{
    private double bonus;
    Manager() 
    {
        super();
        bonus = 0;
    }
    Manager(int id, String name, String dept, double salary, double bonus)
 {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }
    public void accept(Scanner sc) 
{
        super.accept(sc); // accept base class info
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }
    public void display() 
{
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (getSalary() + bonus));
        System.out.println("----------------------------");
    }
    public double totalSalary() 
{
        return getSalary() + bonus;
    }
}
 class Main
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] managers = new Manager[n];
        for (int i = 0; i < n; i++) 
    {
            System.out.println("\nEnter details of Manager " + (i + 1) + ":");
            managers[i] = new Manager();
            managers[i].accept(sc);
        }

        Manager maxManager = managers[0];
        for (int i = 1; i < n; i++)
 {
            if (managers[i].totalSalary() > maxManager.totalSalary()) 
             {
                maxManager = managers[i];
            }
        }
        System.out.println("\nAll Managers Details:");
        for (Manager m : managers) 
      {
            m.display();
        }
        System.out.println("Manager with Maximum Total Salary:");
        maxManager.display();

    }
}
