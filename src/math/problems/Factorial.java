package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a
         * given number using Recursion as well as Iteration.
         *
         */
        int num = 5;
        int result = 1;
        for (int i = 1; i<=num; i++){
            result = result * i;
            System.out.println("The Factorial : "+ result);
        }
        System.out.println("*******************************************");
        System.out.println("The Factorial using Iteration/Hardcoded: "+ result);
        System.out.println("********************************************");
        System.out.println("The Factorial using Recursion/Dynamic: " + factorial(5));
    }
    // Recursion
    public static int factorial(int num){
        if (num==0) {
            return 1;
        }else {
            return num * factorial(num - 1);
        }

    }
}
