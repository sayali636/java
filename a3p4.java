import java.util.*;

class EmployeeVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        for (String s : args) v.add(s);

        System.out.println("Employees starting with 'S':");
        for (String name : v) {
            if (name.startsWith("S") || name.startsWith("s"))
                System.out.println(name);
        }
    }
}
