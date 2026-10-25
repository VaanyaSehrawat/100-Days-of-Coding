// Q77: Check if the elements on the diagonal of a matrix are distinct.

/*
Sample Test Cases:
Input 1:
3 3
1 2 3
4 5 6
7 8 1
Output 1:
False

Input 2:
3 3
1 2 3
4 5 6
7 8 9
Output 2:
True

*/


import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean distinct = true;

        if (rows != cols) {
            distinct = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < rows; j++) {
                    if (matrix[i][i] == matrix[j][j]) {
                        distinct = false;
                        break;
                    }
                }

                if (!distinct) {
                    break;
                }
            }
        }

        System.out.println(distinct ? "True" : "False");

        sc.close();
    }
}
