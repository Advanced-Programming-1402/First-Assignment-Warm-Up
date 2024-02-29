public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if(n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
        return 0;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
        return 0;
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
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for(int i = 0;i < rows;i++){
            for(int j = 0;j <= i;j++){
                system.out.print("*");
            }
            system.out.println();
        }
        return null;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}