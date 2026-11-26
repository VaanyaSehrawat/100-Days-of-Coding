// Q121: Write a C program that creates a text file named info.txt in write mode. The program should take the user’s name and age as input, and write them to the file using fprintf(). After writing, display a message confirming that the data was successfully saved.

/*
Sample Test Cases:
Input 1:
Name: Rahul, Age: 23
Output 1:
File created successfully! Data written to info.txt

*/



import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Q121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("info.txt"));

            pw.printf("Name: %s\nAge: %d", name, age);

            pw.close();

            System.out.println("File created successfully! Data written to info.txt");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }

        sc.close();
    }
}

