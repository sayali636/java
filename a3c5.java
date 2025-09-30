import Series.Fibonacci;
import Series.Cube;
import Series.Square;
import java.util.Scanner;

public class SeriesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        Fibonacci fib = new Fibonacci();
        Cube cube = new Cube();
        Square square = new Square();

        fib.printFibonacci(n);
        cube.printCubes(n);
        square.printSquares(n);

        sc.close();
    }
}
