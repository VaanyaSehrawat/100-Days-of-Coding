// Q66: Insert an element in a sorted array at the appropriate position.

/*
Sample Test Cases:
Input 1:
5
1 2 4 5 6
3
Output 1:
1 2 3 4 5 6

*/


import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        int i = n - 1;

        while (i >= 0 && arr[i] > element) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = element;

        for (int j = 0; j <= n; j++) {
            System.out.print(arr[j] + " ");
        }

        sc.close();
    }
}

