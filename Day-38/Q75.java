// Q75: Add two matrices.

/*
Sample Test Cases:
Input 1:
2 2
1 2
3 4
2 2
5 6
7 8
Output 1:
6 8
10 12

*/


import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();

        int[][] matrix1 = new int[rows1][cols1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        int[][] matrix2 = new int[rows2][cols2];

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Addition not possible");
        } else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
