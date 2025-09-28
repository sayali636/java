import java.io.File;

public class DeleteTxtFiles {
    public static void main(String[] args) {
        for (String fname : args) {
            File f = new File(fname);
            if (f.exists()) {
                if (fname.endsWith(".txt")) {
                    f.delete();
                    System.out.println("Deleted: " + fname);
                } else {
                    System.out.println("File Name: " + f.getName());
                    System.out.println("Location: " + f.getAbsolutePath());
                    System.out.println("Size: " + f.length() + " bytes");
                }
            } else {
                System.out.println(fname + " does not exist.");
            }
        }
    }
}
