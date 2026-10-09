//Q50: Write a program to print the following pattern:
// *****
//  ****
//   ***
//    **
//     *

/*
Sample Test Cases:
Input 1:

Output 1:
*****
 ****
  ***
   **
    *

Input 2:

Output 2:
Note: Spaces indicate indentation.

*/


public class Q50 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}