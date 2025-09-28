import java.util.Scanner;

class SmallNumberException extends Exception {
    public SmallNumberException(String msg) {
        super(msg);
    }
}

class LargeNumberException extends Exception {
    public LargeNumberException(String msg) {
        super(msg);
    }
}

public class FactorialCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 5) {
                throw new SmallNumberException("Number is small");
            } else if (num > 10) {
                throw new LargeNumberException("Number is Greater");
            } else {
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial = " + fact);
            }

        } catch (SmallNumberException | LargeNumberException e) {
            System.out.println("User Defined Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("System Exception: " + e);
        }
        sc.close();
    }
}
