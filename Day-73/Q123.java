// Q123: Read a text file and count the total number of characters, words, and lines. A word is defined as a sequence of non-space characters separated by spaces or newlines.

/*
Sample Test Cases:
Input 1:
File: sample.txt (Content: Hello world\nThis is C programming)
Output 1:
Characters: 31
Words: 5
Lines: 2

*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q123 {
    public static void main(String[] args) {

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                characters += line.length();

                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    words += trimmedLine.split("\\s+").length;
                }
            }

            br.close();

            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
        }
        catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

