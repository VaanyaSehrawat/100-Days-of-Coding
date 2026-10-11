// Q51: Write a program to print the following pattern:
//     5
//    45
//   345
//  2345
// 12345

/*
Sample Test Cases:
Input 1:

Output 1:
    5
   45
  345
 2345
12345

*/


public class Q51 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 6 - i; j <= 5; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}