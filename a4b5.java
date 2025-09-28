import java.io.*;
import java.util.*;

public class ReverseWordsFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("source.txt"));

            while (sc.hasNext()) {
                String word = sc.next();
                String rev = new StringBuilder(word).reverse().toString();
                System.out.print(rev + " ");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
