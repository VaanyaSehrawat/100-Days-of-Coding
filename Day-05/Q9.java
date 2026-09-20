//Q9: Write a program to calculate simple and compound interest for given principal, rate, and time.

/*
Sample Test Cases:
Input 1:
1000 5 2
Output 1:
Simple Interest=100, Compound Interest=102.5

Input 2:
5000 7 3
Output 2:
Simple Interest=1050, Compound Interest=1125.76

*/

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;

        System.out.printf("Simple Interest=%.0f, Compound Interest=%.2f%n",
                simpleInterest, compoundInterest);

        sc.close();
    }
}