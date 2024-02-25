import java.util.Scanner;

public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public class Recursion {
        public static int factoriall(int n){
            if( n <= 1)
                return 1;
            else
                return n * factoriall(n - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(factoriall(n));
        }
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public class Fibonacci {
        public static int fib(int n) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int result = fib(n);
            System.out.println(result);
            scanner.close();
        }
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public class GenerateTriangle {
        public static void main(String[] args) {
            int rows = 5;
            generateTriangle(rows);
        }

        public static void generateTriangle(int numRows) {
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        // test your code here!
    }

}