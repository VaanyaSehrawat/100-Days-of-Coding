// Q114: Write a program to take a string s as input. The task is to find the length of the longest substring without repeating characters. Print the length as output.

/*
Sample Test Cases:
Input 1:
s = "abcabcbb"
Output 1:
3

Input 2:
s = "bbbbb"
Output 2:
1

Input 3:
s = "pwwkew"
Output 3:
3

*/


import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[65536];
            int currentLength = 0;

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (seen[ch]) {
                    break;
                }

                seen[ch] = true;
                currentLength++;

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        System.out.println(maxLength);

        sc.close();
    }
}
