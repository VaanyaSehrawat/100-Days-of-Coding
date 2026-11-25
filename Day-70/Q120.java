// Q120: Write a program to take a string input. Change it to sentence case.

/*
Sample Test Cases:
Input 1:
str = I am trying to build logic.
Output 1:
I Am Trying To Build Logic

Input 2:
str = The classes are supposed to start early.
Output 2:
The Classes Are Supposed To Start Early.

Input 3:
str = We are going to look at 26 different test cases.
Output 3:
We Are Going To Look At 26 Different Test Cases.

*/


import java.util.Scanner;

public class Q120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        boolean newWord = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result += ch;
                newWord = true;
            } else {
                if (newWord) {
                    result += Character.toUpperCase(ch);
                    newWord = false;
                } else {
                    result += Character.toLowerCase(ch);
                }
            }
        }

        System.out.println(result);
        sc.close();
    }
}
