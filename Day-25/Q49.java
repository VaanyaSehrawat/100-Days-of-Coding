//Q49: Write a program to print the following pattern:
// 5
// 45
// 345
// 2345
// 12345

/*
Sample Test Cases:
Input 1:

Output 1:
5
45
345
2345
12345

*/


public class Q49 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 6 - i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}