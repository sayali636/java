import java.io.*;
import java.util.Scanner;

public class StringToAsciiFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            FileWriter fw = new FileWriter("ascii.txt");

            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i) + " -> " + (int) str.charAt(i) + "\n");
            }

            fw.close();
            System.out.println("ASCII values written to ascii.txt");
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
