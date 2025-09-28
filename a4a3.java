import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sc.nextLine();

        File f = new File(fname);
        if (f.exists()) {
            System.out.println("File size = " + f.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
        sc.close();
    }
}
