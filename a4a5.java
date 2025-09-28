import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class DigitAddition {
    static int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 100) {
                throw new OutOfRangeException("Number is out of Range");
            }

            System.out.println("Sum of digits = " + addDigits(num));
        } catch (OutOfRangeException e) {
            System.out.println("User Defined Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("System Exception: " + e);
        }
        sc.close();
    }
}
