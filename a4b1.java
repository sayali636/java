import java.io.*;

public class CopyFileChangeCase {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");  // source file
            FileWriter fw = new FileWriter("target.txt");  // target file

            int ch;
            while ((ch = fr.read()) != -1) {
                char c = (char) ch;

                if (Character.isDigit(c)) {
                    fw.write('*');   // replace digits
                } else if (Character.isUpperCase(c)) {
                    fw.write(Character.toLowerCase(c));  // change case
                } else if (Character.isLowerCase(c)) {
                    fw.write(Character.toUpperCase(c));  // change case
                } else {
                    fw.write(c); // keep symbols as it is
                }
            }

            fr.close();
            fw.close();
            System.out.println("File copied with changes!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
