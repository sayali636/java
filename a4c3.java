import java.io.*;
import java.util.Scanner;

public class FileCount {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;
        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines++;
                words += line.split("\\s+").length;
                chars += line.length();
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
