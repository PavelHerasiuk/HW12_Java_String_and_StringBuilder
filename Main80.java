package by.epam.linear_program.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.
public class Main80 {

    private static int countLowerCase(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                counter++;
            }
        }
        return counter;
    }

    private static int countUpperCase(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a sentence in English:");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = reader.readLine();
        System.out.printf("Lower case letter: %d%n", countLowerCase(line));
        System.out.printf("Upper case letter: %d%n", countUpperCase(line));
    }
}