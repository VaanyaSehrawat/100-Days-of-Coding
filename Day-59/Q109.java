// Q109: Write a program to take an integer array arr and an integer k as inputs. Print the maximum sum of all the subarrays of size k.

/*
Sample Test Cases:
Input 1:
arr[100, 200, 300, 400] = , k = 2
Output 1:
700

Input 2:
arr[1, 4, 2, 10, 23, 3, 1, 0, 20] = , k = 4
Output 2:
39

Input 3:
arr[100, 200, 300, 400] = , k = 1
Output 3:
400

*/


import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println(-1);
            sc.close();
            return;
        }

        long sum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        long maxSum = sum;

        // Slide the window
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);

        sc.close();
    }
}
