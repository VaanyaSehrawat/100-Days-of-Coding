// Q93: Check if two strings are anagrams of each other.

/*
Sample Test Cases:
Input 1:
listen
silent
Output 1:
Anagrams

Input 2:
hello
world
Output 2:
Not anagrams

*/

import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean anagram = true;

        if (str1.length() != str2.length()) {
            anagram = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(j) == ch) {
                        count1++;
                    }

                    if (str2.charAt(j) == ch) {
                        count2++;
                    }
                }

                if (count1 != count2) {
                    anagram = false;
                    break;
                }
            }
        }

        if (anagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }

        sc.close();
    }
}