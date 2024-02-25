import java.util.Scanner;

public class Exercises1
{
    /*
    implement a function that returns factorial of given n
    */

    public static long factorial(int n) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * i;
        }
        return answer;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */

    public static long fibonacci(int n) {
        long fib;
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            fib = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fib;
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

    public static char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long fact = factorial(n);
        System.out.println(fact);

        int m = input.nextInt();
        long fibo = fibonacci(m);
        System.out.println(fibo);

        int r = input.nextInt();
        char[][] triangle = new char[r][r];
        triangle = generateTriangle(r);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }

}
