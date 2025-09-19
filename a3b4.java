import java.util.*;

public class HashTableDemo
 {
    public static void main(String[] args)
    {
        Hashtable ht = new Hashtable();
        ht.put("sayali", 30000);
        ht.put("tanuja", 25000);
        ht.put("pratiksha", 40000);

        System.out.println("Employee Details:");
        for (Map.Entry<String, Integer> e : ht.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String name = sc.next();

        if (ht.containsKey(name))
       {
            System.out.println(name + "'s Salary: " + ht.get(name));
        } else
        {
            System.out.println("Employee not found!");
        }
    }
}
