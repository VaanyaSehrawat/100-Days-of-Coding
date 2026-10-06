//Q43: Write a program to check if a number is a strong number.

/*
Sample Test Cases:
Input 1:
145
Output 1:
Strong number

Input 2:
123
Output 2:
Not strong number

*/

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;

            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not strong number");
        }

        sc.close();
    }
}