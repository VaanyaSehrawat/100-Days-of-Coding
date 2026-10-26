// Q79: Perform diagonal traversal of a matrix.

/*
Sample Test Cases:
Input 1:
3 3
1 2 3
4 5 6
7 8 9
Output 1:
1 2 4 7 5 3 6 8 9

*/

import java.util.Scanner;

public class Q79 {
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

        for (int d = 0; d < rows + cols - 1; d++) {
            int row = Math.min(d, rows - 1);
            int col = d - row;

            while (row >= 0 && col < cols) {
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
        }

        sc.close();
    }
}