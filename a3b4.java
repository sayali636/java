// Create a hashtable containing employee name & salary. Display the details of the 
//hashtable. Also search for a specific Employee and display salary of that employee.
 
import java.util.*;
 class Main
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

           Hashtable employees = new Hashtable();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) 
{
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            employees.put(name, new Double(salary));
        }

        System.out.println("\nEmployee Details:");
        Enumeration keys = employees.keys();
        while (keys.hasMoreElements()) 
        {
            String name = (String) keys.nextElement();
            double salary = ((Double) employees.get(name)).doubleValue();
            System.out.println("Name: " + name + ", Salary: " + salary);
        }

       
        System.out.print("\n name to search: ");
        String searchName = sc.nextLine();

        if (employees.containsKey(searchName))
       {
            double salary = ((Double) employees.get(searchName)).doubleValue();
            System.out.println("Salary of " + searchName + " = " + salary);
        } 
       else 
        {
            System.out.println(searchName + " not found!");
        }
    }
}
