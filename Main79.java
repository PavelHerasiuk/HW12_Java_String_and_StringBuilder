package by.epam.linear_program.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
//  Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Main79 {
    private static String findLongestWord(String line) {
        String longestWord = "";
        int maxLength = 0;
        String[] words = line.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите любое предложение:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println("Самое длинное слово ---> " + (findLongestWord(line)));
    }
}