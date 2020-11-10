package by.epam.linear_program.main;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Main72 {
    private static int findMoreSpaces(String line) {
        int counter = 0;
        int maxCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxCount < counter) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String line = "Let's   count  all    the  spaces      in    this text.";
        int moreSpaces = findMoreSpaces(line);
        System.out.println("Наибольшее количество подряд идущих пробелов в строке: " + moreSpaces);
    }
}