import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String msg) {
        super(msg);
    }
}

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new UnderAgeException("Candidate is not eligible for voting.");
            }

            System.out.println("Candidate is eligible for voting.");
        } catch (UnderAgeException e) {
            System.out.println("User Defined Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("System Exception: " + e);
        }
        sc.close();
    }
}
