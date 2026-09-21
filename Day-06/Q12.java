//Q12: Write a program to input an integer and check whether it is positive, negative or zero using nested if–else.

/*
Sample Test Cases:
Input 1:
-5
Output 1:
Negative

Input 2:
0
Output 2:
Zero

Input 3:
10
Output 3:
Positive

*/

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 0) {
            if (num == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positive");
            }
        } else {
            System.out.println("Negative");
        }

        sc.close();
    }
}