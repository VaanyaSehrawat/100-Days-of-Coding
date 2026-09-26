//Q22: Write a program to find profit or loss percentage given cost price and selling price.

/*
Sample Test Cases:
Input 1:
1000 1200
Output 1:
Profit 20%

Input 2:
1000 800
Output 2:
Loss 20%

Input 3:
1000 1000
Output 3:
No Profit No Loss

*/

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double costPrice = sc.nextDouble();
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;

            System.out.println("Profit " + (int) profitPercentage + "%");
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;

            System.out.println("Loss " + (int) lossPercentage + "%");
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
