import java.util.*;

public class CitySTD
 {
    public static void main(String[] args)
      {
        // Create Hashtable
        Hashtable ht = new Hashtable();
        ht.put("Pune", "020");
        ht.put("Mumbai", "022");
        ht.put("Delhi", "011");
        ht.put("Nagpur", "0712");

        // Display all details
        System.out.println("City and STD Codes:");
        for (Map.Entry<String, String> e : ht.entrySet())
        {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Search for a city
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter city name to search: ");
        String city = sc.next();

        if (ht.containsKey(city))
            System.out.println("STD Code of " + city + " is " + ht.get(city));
        else
            System.out.println("City not found!");
    }
}
