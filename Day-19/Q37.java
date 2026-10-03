//Q37: Write a program to find the LCM of two numbers.

/*
Sample Test Cases:
Input 1:
4 5
Output 1:
20

Input 2:
7 3
Output 2:
21

*/

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println(lcm);

        sc.close();
    }
}