import java.util.Scanner;

public class ex2 {
    public static int fibonacciIterative(int n) {
            if (n <= 1) {
                return n;
            }
            int prev1 = 1;
            int prev2 = 1;
            int fib = 0;
            for (int i = 2; i < n; i++) {
                fib = prev1 + prev2;
                prev1 = prev2;
                prev2 = fib;
            }
            return fib;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {

                int iterativeResult = fibonacciIterative(n - 1); // Subtract 1 because Fibonacci is 0-indexed

                System.out.println("Fibonacci(" + n + ") = " + iterativeResult);
            }


        }
    }

