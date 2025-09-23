import java.util.Scanner;

class Book {
    int bid, qty;
    String bname;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        Book arr[] = new Book[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Book();
            System.out.println("Enter bid, bname, qty:");
            arr[i].bid = sc.nextInt();
            arr[i].bname = sc.next();
            arr[i].qty = sc.nextInt();
        }

        System.out.print("Enter book name to search: ");
        String search = sc.next();
        boolean found = false;

        for (Book b : arr) {
            if (b.bname.equalsIgnoreCase(search)) {
                System.out.println("Quantity of " + b.bname + " = " + b.qty);
                found = true;
            }
        }
        if (!found)
            System.out.println("Book not found!");
    }
}
