package patterns;

import java.sql.SQLOutput;

public class PatternPrograms {


    /**
     *  Print the Square Fill Pattern
     *
     *       ****
     *       ****
     *       ****
     *
     * @param n
     */
    public static void squareFillPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }


    /**  Right HalfPyramid
     *
     *          *
     *          **
     *          ***
     *          ****
     *
     *
     * @param n
     */

    public static void rightHalfPyramid(int n){

        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    /**
     *  Left Half Pyramid
     *            ******
     *            *****
     *            ****
     *            ***
     *            **
     *            *
     * @param
     */


    public static void reverseRightHalfPyramidPattern(int n) {

        for (int i = n; i >= 1; --i) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                for (int k = j; k <= j; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

    /**
     *  Number increasing Triangle
     *         1
     *         12
     *         123
     *         1234
     * @param
     */


    public static void numberIncreasingPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /**
     *  Number Triangle
     *         1
     *         22
     *         333
     *         4444
     * @param
     */


    public static void numberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    /**
     *  Number increasing reverse Triangle
     *         12345
     *         1234
     *         123
     *         12
     *         1
     * @param
     */


    public static void numberIncreasingReversePyramid(int n){




    }




    public static void main(String[] args) {
        //squareFillPattern(5);
        //rightHalfPyramid(3);
        //reverseRightHalfPyramidPattern(6);
       // numberIncreasingPyramid(5);
        //numberTriangle(10);
        numberIncreasingReversePyramid(10);
    }

}
