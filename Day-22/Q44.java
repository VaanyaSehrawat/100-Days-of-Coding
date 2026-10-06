//Q44: Write a program to find the sum of the series: 1 + 3/4 + 5/6 + 7/8 + … up to n terms.

/*
Sample Test Cases:
Input 1:
3
Output 1:
Approximate sum: 3.3

Input 2:
5
Output 2:
Approximate sum: 4.4

*/

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 1;

        for (int i = 2; i <= n; i++) {
            int numerator = 2 * i - 1;
            int denominator = 2 * i;
            sum = sum + (double) numerator / denominator;
        }

        System.out.printf("Approximate sum: %.1f%n", sum);

        sc.close();
    }
}
