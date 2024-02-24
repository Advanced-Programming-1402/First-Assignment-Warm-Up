public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
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
    public char[][] generateTriangle(int rows) {
        char[][] ans = new char[rows][];

        for (int i = 0; i < rows; i++) {
            ans[i] = new char[i + 1];

            for (int j = 0; j <= i; j++) {
                ans[i][j] = '*';
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}