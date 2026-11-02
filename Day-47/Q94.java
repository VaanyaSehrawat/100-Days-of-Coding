// Q94: Find the longest word in a sentence.

/*
Sample Test Cases:
Input 1:
I love programming
Output 1:
programming

*/

import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println(longest);

        sc.close();
    }
}