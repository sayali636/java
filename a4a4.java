import java.util.Scanner;

class ZeroNumberException extends Exception {
    public ZeroNumberException(String msg) {
        super(msg);
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String input = sc.next();

            // check numeric
            int num = Integer.parseInt(input);

            if (num == 0) {
                throw new ZeroNumberException("Number is Zero");
            }

            // check palindrome
            String rev = new StringBuilder(input).reverse().toString();
            if (input.equals(rev)) {
                System.out.println(num + " is a Palindrome.");
            } else {
                System.out.println(num + " is NOT a Palindrome.");
            }
        } catch (ZeroNumberException e) {
            System.out.println("User Defined Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number is Invalid");
        }
        sc.close();
    }
}
