// Q98: Print initials of a name with the surname displayed in full.

/*
Sample Test Cases:
Input 1:
John David Doe
Output 1:
J.D. Doe

*/

import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        String[] words = name.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            System.out.print(words[i].charAt(0) + ".");
        }

        System.out.println(" " + words[words.length - 1]);

        sc.close();
    }
}