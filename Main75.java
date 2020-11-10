package by.epam.linear_program.main;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
public class Main75 {

    private static String makeWord(String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }

    public static void main(String[] args) {
        String informatics = "информатика";
        System.out.println(makeWord(informatics));
    }
}