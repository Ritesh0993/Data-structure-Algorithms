package basicMaths;

public class BasicMathProblems {
    public static void countNumber(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println("number count is :" + count);
    }

    public static int reverseNumber(int n) {
        int reversedNumber = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);
        while (n > 0) {

            int lastDigit = n % 10;

            if (reversedNumber > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;
            }
            reversedNumber = (reversedNumber * 10) + lastDigit;
            n = n / 10;
        }
        return isNegative ? -reversedNumber : reversedNumber;
    }


    /**
     * Palindrome Number
     *
     * @param x
     */
    public static boolean isPalindrome(int x) {
        int givenNumber = x;
        int reversedNumber = 0;
        boolean isNegative = x < 0;
        boolean isPalindrome = false;

        while (x > 0) {
            int ld = x % 10;
            if (reversedNumber > (Integer.MAX_VALUE - ld) / 10) {
                return false;
            }
            reversedNumber = (reversedNumber * 10) + ld;
            x = x / 10;
        }

        if (givenNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Armstrong Number :
     *
     * @param number
     * @return
     */

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = 0;
        int sum = 0;
        while (number != 0) {
            number /= 10;
            numDigits++;
        }
        number = originalNumber;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }
        return sum == originalNumber;
    }

    /**
     * Print All Divisor
     *
     * @param n
     * @return
     */
    public static void printAllDivisior(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     *  Prime Numbers
     * @param n
     */

    public static void primeNumber(int n){
        int count = 0;

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i!=i)){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Given Number is Prime Number ");
        }else{
            System.out.println("Given Number is Not Prime Number ");
        }
    }

    /**
     *   GCD Gretest common divisor
     *   HCF highest common factor
     * @param a,b
     */
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



    public static void main(String[] args) {
        //  countNumber(12524);
        //   System.out.println(reverseNumber(1534236469));
        //   System.out.println(reverseNumber(-456));
        //   System.out.println(isPalindrome(-121));
       //    System.out.println(isArmstrongNumber(153));
       //    printAllDivisior(1256);
       //    primeNumber(11);
             System.out.println("GCD/HCF of " +   calculateGCD(10, 12));
    }


}
