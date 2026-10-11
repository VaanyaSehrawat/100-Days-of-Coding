// Q52: Write a program to print the following pattern:

// *

// *
// *
// *

// *
// *
// *
// *
// *

// *
// *
// *

// *



/*
Sample Test Cases:
Input 1:

Output 1:
Pattern with stars spaced irregularly as shown.

*/


public class Q52 {
    public static void main(String[] args) {

        int[] groups = {1, 3, 5, 3, 1};

        for (int group : groups) {
            for (int i = 1; i <= group; i++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}