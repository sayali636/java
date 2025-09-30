//Define an Interface “Integer” with a abstract method check().Write a Java program to 
//check whether a given number is Positive or Negative.
 
import java.util.Scanner;

interface Integer 
{
    void check(int n);
}

class NumberCheck implements Integer 
{
    public void check(int n) 
 {
        if (n > 0) 
        {
            System.out.println(n + " is Positive");
        } 
        else if (n < 0) 
        {
            System.out.println(n + " is Negative");
        } 
        else 
        {
            System.out.println("Number is Zero");
        }
    }
}

public class CheckNumber 
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        NumberCheck obj = new NumberCheck();
        obj.check(num);
    }
}
