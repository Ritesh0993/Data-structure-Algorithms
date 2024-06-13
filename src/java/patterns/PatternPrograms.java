package patterns;

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




    public static void main(String[] args) {
        //squareFillPattern(5);
        //rightHalfPyramid(3);
        reverseRightHalfPyramidPattern(6);
    }


}
