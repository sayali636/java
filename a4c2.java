import java.io.File;

public class ListTxtFiles {
    public static void main(String[] args) {
        File dir = new File("C:\\myfiles");  // change path as needed
        File[] files = dir.listFiles();

        System.out.println("Text files in directory:");
        if (files != null) {
            for (File f : files) {
                if (f.isFile() && f.getName().endsWith(".txt")) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
