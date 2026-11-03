// Q96: Reverse each word in a sentence without changing the word order.

/*
Sample Test Cases:
Input 1:
I love coding
Output 1:
I evol gnidoc

*/

import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String reversed = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed += words[i].charAt(j);
            }

            result += reversed + " ";
        }

        System.out.println(result.trim());

        sc.close();
    }
}