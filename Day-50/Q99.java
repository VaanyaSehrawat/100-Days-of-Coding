// Q99: Change the date format from dd/04/yyyy to dd-Apr-yyyy.

/*
Sample Test Cases:
Input 1:
15/04/2025
Output 1:
15-Apr-2025

*/

import java.util.Scanner;

public class Q99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        String[] parts = date.split("/");

        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        String monthName = "";

        switch (month) {
            case "01": monthName = "Jan"; break;
            case "02": monthName = "Feb"; break;
            case "03": monthName = "Mar"; break;
            case "04": monthName = "Apr"; break;
            case "05": monthName = "May"; break;
            case "06": monthName = "Jun"; break;
            case "07": monthName = "Jul"; break;
            case "08": monthName = "Aug"; break;
            case "09": monthName = "Sep"; break;
            case "10": monthName = "Oct"; break;
            case "11": monthName = "Nov"; break;
            case "12": monthName = "Dec"; break;
        }

        System.out.println(day + "-" + monthName + "-" + year);

        sc.close();
    }
}
