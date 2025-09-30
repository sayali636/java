//Define an abstract class Staff with members name &address. Define two sub classes 
//FullTimeStaff(Departmet, Salary) and PartTimeStaff(numberOfHours, ratePerHour). 
//Define appropriate constructors. Create n objects which could be of either 
//FullTimeStaff or PartTimeStaff class by asking the user’s choice. Display details of 
//FulltimeStaff and PartTimeStaff. 

import java.util.*;
abstract class Staff
 {
    String name;
    String address;

    Staff(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    abstract void display();
}
class FullTimeStaff extends Staff 
{
    String department;
    double salary;

        FullTimeStaff(String name, String address, String department, double salary) 
{
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    void display() 
{
        System.out.println("FullTime Staff:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}
class PartTimeStaff extends Staff 
{
    int numberOfHours;
    double ratePerHour;


    PartTimeStaff(String name, String address, int hours, double rate)
     {
        super(name, address);
        this.numberOfHours = hours;
        this.ratePerHour = rate;
    }

    void display() 
    {
        System.out.println("PartTime Staff:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Total Pay: " + (numberOfHours * ratePerHour));
        System.out.println("----------------------");
    }
}
 class Main 
{
    public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of staff: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Staff[] staffArray = new Staff[n];

        for (int i = 0; i < n; i++) 
         {
            System.out.println("\nEnter details for staff " + (i + 1) + ":");
            System.out.print("Enter 1 for FullTime, 2 for PartTime: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            if (choice == 1) 
           {
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
                staffArray[i] = new FullTimeStaff(name, address, dept, salary);
            } 
         else if (choice == 2) 
           {
                System.out.print("Enter Number of Hours: ");
                int hours = sc.nextInt();
                System.out.print("Enter Rate per Hour: ");
                double rate = sc.nextDouble();
                sc.nextLine();
                staffArray[i] = new PartTimeStaff(name, address, hours, rate);
            } 
      else
          {
                System.out.println("Invalid choice! Try again.");
                i--;   
          }
        }

        System.out.println("\n--- Staff Details ---");
        for (int i = 0; i < n; i++) 
        {
            staffArray[i].display();
        }

        sc.close();
    }
}
