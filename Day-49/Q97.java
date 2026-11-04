// Q97: Print the initials of a name.

/*
Sample Test Cases:
Input 1:
John Doe
Output 1:
J.D.

*/

import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || name.charAt(i - 1) == ' ') {
                System.out.print(name.charAt(i) + ".");
            }
        }

        sc.close();
    }
}