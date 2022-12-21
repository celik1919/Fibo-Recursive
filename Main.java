import java.util.Scanner;

public class Main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {

        Scanner mec = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = mec.nextInt();
        System.out.print("Fibonacci value of " + n + ": " + fib(n));
    }
}