import java.io.*;

public class FileReverse {
    public static void main(String[] args) {
        try {
            File file = new File("source.txt");
            FileReader fr = new FileReader(file);

            char[] data = new char[(int) file.length()];
            fr.read(data);

            System.out.println("File content in reverse:");
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.print(data[i]);
            }

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
