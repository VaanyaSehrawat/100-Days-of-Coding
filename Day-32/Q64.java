// Q64: Find the digit that occurs the most times in an integer number.

/*
Sample Test Cases:
Input 1:
112233
Output 1:
1

Input 2:
887799
Output 2:
7

*/


import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] frequency = new int[10];

        if (num == 0) {
            frequency[0]++;
        }

        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            frequency[digit]++;
            num = num / 10;
        }

        int maxFrequency = 0;
        int mostFrequentDigit = 0;

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentDigit = i;
            }
        }

        System.out.println(mostFrequentDigit);

        sc.close();
    }
}
