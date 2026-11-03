// Q95: Check if one string is a rotation of another.

/*
Sample Test Cases:
Input 1:
abcde
deabc
Output 1:
Rotation

Input 2:
abc
acb
Output 2:
Not rotation

*/

import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not rotation");
        } else {
            String combined = str1 + str1;

            if (combined.contains(str2)) {
                System.out.println("Rotation");
            } else {
                System.out.println("Not rotation");
            }
        }

        sc.close();
    }
}