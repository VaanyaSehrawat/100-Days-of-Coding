//Q25: Write a program to implement a basic calculator using switch-case for +, -, *, /, %.

/*
Sample Test Cases:
Input 1:
4 2 +
Output 1:
6

Input 2:
10 3 %
Output 2:
1

Input 3:
15 5 /
Output 3:
3

*/

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;

            case '%':
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}