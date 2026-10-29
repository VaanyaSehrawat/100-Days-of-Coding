// Q87: Count spaces, digits, and special characters in a string.

/*
Sample Test Cases:
Input 1:
a b1&2
Output 1:
Spaces=1, Digits=2, Special=1

*/

import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int spaces = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                spaces++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (!(ch >= 'a' && ch <= 'z') &&
                       !(ch >= 'A' && ch <= 'Z')) {
                special++;
            }
        }

        System.out.println("Spaces=" + spaces + ", Digits=" + digits + ", Special=" + special);

        sc.close();
    }
}