package basicRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionExamples {

    /**
     * printNumbers
     * @param n
     */

    public static void printNo1ToN(int n) {
        if (n == 0) {
            return;
        }
        printNo1ToN(n - 1);
        System.out.print(n+" ");
    }

    /**
     *
     * @param N
     */

    public static void printNoNTo1(int N)
    {
        //Your code here
        if(N == 0){
            return ;
        }
        System.out.print(N+" ");
        printNoNTo1(N-1);

    }

    /**
     *  Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.
     *      Input:
     *      n=5
     *      Output:
     *          225
     *
     * @param n
     */

    public static long SumOfSeries(long n ){
        long sum = 0;
        if(n==1){
            return 1;
        }
       return n*n*n + SumOfSeries(n-1);

    }

    /** factorial
     *  5! = 5*4*3*2*1    = 120
     * @param n
     * @return
     */
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        System.out.println();
        return n*factorial(n-1);
    }

    /**
     *  A number n is called a factorial number if it is the factorial of a positive integer.
     *  For example, the first few factorial numbers are 1, 2, 6, 24, 120,
     * Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.
     * @param n
     * @return
     */

    public static List<Long> findFactorialNumbers(int n) {
        List<Long> factorialNumbers = new ArrayList<>();
        long fact = 1;
        int i = 1;

        while (fact <= n) {
            factorialNumbers.add(fact);
            i++;
            fact *= i;
        }

        return factorialNumbers;
    }


    /**
     *   Reverse an array of integer
     * @param array
     * @param start
     * @param end
     */


    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseArray(array, start + 1, end - 1);
    }

    /**
     *  check if gievn string is palindrome or not
     * @param s
     * @return
     */
    public static boolean isStringPalindrome(String s) {

        StringBuilder cleanedString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedString.append(Character.toLowerCase(c));
            }
        }
        String forward = cleanedString.toString();
        String backward = cleanedString.reverse().toString();
        return forward.equals(backward);
    }


    public static void main(String[] args) {
         // printNo1ToN(10);
        // printNoNTo1(10);
        // long sum =  SumOfSeries(7);
        //System.out.println(factorial(5));
     //  System.out.println(findFactorialNumbers(120));

//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println("Original Array: " + Arrays.toString(array));
//        reverseArray(array, 0, array.length - 1);
//        System.out.println("Reversed Array: " + Arrays.toString(array));

        String s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isStringPalindrome(s);
        System.out.println("string \"" + s + "\" a palindrome? " + isPalindrome);
    }


}
