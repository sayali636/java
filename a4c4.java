import java.io.*;

public class CharCategory {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                char c = (char) ch;
                if (Character.isLetter(c)) {
                    // reverse case
                    if (Character.isUpperCase(c))
                        System.out.print(Character.toLowerCase(c));
                    else
                        System.out.print(Character.toUpperCase(c));
                } else if (Character.isDigit(c)) {
                    System.out.print("[Digit]");
                } else if (Character.isWhitespace(c)) {
                    System.out.print("[Space]");
                } else {
                    System.out.print(c);
                }
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
