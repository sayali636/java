import java.util.Scanner;

class Person {
    int pid, age;
    String pname, gender;

    // Default constructor
    Person() {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    // Parameterized constructor
    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println(pid + " " + pname + " " + age + " " + gender);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person persons[] = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter pid, pname, age, gender:");
            int id = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            String gen = sc.next();
            persons[i] = new Person(id, name, age, gen);
        }

        System.out.println("\n--- Person Details ---");
        for (Person p : persons) {
            p.display();
        }
    }
}
