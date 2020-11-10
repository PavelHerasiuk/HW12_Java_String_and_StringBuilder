package by.epam.linear_program.main;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Main76 {

    private static int countCharacter(String line, char ch) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String line = "Count how many times the letter “a” occurs among the characters of a given string.";
        System.out.println("Буква 'а' встречается ---> " + countCharacter(line, 'a') + " раз");
    }
}