//Q41: Write a program to swap the first and last digit of a number.

/*
Sample Test Cases:
Input 1:
1234
Output 1:
4231

Input 2:
1001
Output 2:
1001

*/

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 10) {
            System.out.println(num);
            sc.close();
            return;
        }

        int lastDigit = num % 10;

        int divisor = 1;
        int temp = num;

        while (temp >= 10) {
            temp = temp / 10;
            divisor = divisor * 10;
        }

        int firstDigit = temp;

        int middle = (num % divisor) / 10;

        int result = lastDigit * divisor + middle * 10 + firstDigit;

        System.out.println(result);

        sc.close();
    }
}