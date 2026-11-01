// Q92: Find the first repeating lowercase alphabet in a string.

/*
Sample Test Cases:
Input 1:
stress
Output 1:
s

*/

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    System.out.println(ch);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No repeating character");
        }

        sc.close();
    }
}