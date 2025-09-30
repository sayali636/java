//  Create a hashtable containing city name & STD code. Display the details of the 
//hashtable. Also search for a specific city and display STD code of that city.

import java.util.*;
class Main 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        Hashtable citySTD = new Hashtable();
        
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();         
          for (int i = 0; i < n; i++) 
       {
            System.out.print("Enter city name: ");
            String city = sc.nextLine();
            System.out.print("Enter STD code: ");
            int std = sc.nextInt();
            sc.nextLine(); 
            citySTD.put(city, new Integer(std)); 
        }
        
        System.out.println("\nCity Details:");
        Enumeration keys = citySTD.keys();
        while (keys.hasMoreElements()) 
        {
            String city = (String) keys.nextElement();
            int std = ((Integer) citySTD.get(city)).intValue();
            System.out.println("City: " + city + ", STD Code: " + std);
        }
         System.out.print("\n name to search: ");
        String searchCity = sc.nextLine();
        
        if (citySTD.containsKey(searchCity))
         {
            int std = ((Integer) citySTD.get(searchCity)).intValue();
            System.out.println("STD Code of " + searchCity + " = " + std);
        } 
    else 
        {
            System.out.println(searchCity + " not found!");
        }
        
        sc.close();
    }
}
