//Q31: Write a program to take a number as input and print its equivalent binary representation.

/*
Sample Test Cases:
Input 1:
10
Output 1:
1010

Input 2:
7
Output 2:
111

*/

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int remainder = num % 2;
            binary = binary + remainder * place;
            place = place * 10;
            num = num / 2;
        }

        System.out.println(binary);

        sc.close();
    }
}
