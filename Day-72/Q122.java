// Q122: Write a C program that opens an existing file (e.g., info.txt) and reads its contents using fgets(). The program should print all the lines to the console until EOF (end of file) is reached.

/*
Sample Test Cases:
Input 1:
File: info.txt (Content: Name: Rahul\nAge: 23)
Output 1:
Name: Rahul
Age: 23

*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q122 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("info.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
