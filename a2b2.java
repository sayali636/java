import java.util.Scanner;

class Product {
    int pid;
    String pname;
    double price;

    void accept(int id, String name, double pr) {
        pid = id;
        pname = name;
        price = pr;
    }

    void display() {
        System.out.println(pid + " " + pname + " " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product arr[] = new Product[n];

        double total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = new Product();
            System.out.println("Enter pid, pname, price:");
            int id = sc.nextInt();
            String name = sc.next();
            double pr = sc.nextDouble();
            arr[i].accept(id, name, pr);
            total += pr;
        }

        System.out.println("\n--- Product Details ---");
        for (Product p : arr) {
            p.display();
        }

        System.out.println("Total Amount = " + total);
    }
}
