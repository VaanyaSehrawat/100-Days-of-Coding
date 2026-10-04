//Q40: Write a program to find the 1’s complement of a binary number and print it.

/*
Sample Test Cases:
Input 1:
1010
Output 1:
0101

Input 2:
1111
Output 2:
0000

*/

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }

        sc.close();
    }
}

