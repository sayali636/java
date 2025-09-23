import java.util.*;

class Employee {
    static String names[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        Arrays.sort(names);

        System.out.println("\n--- Sorted Employee Names ---");
        for (String nm : names) {
            System.out.println(nm);
        }
    }
}
