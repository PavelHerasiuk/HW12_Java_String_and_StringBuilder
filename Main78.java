package by.epam.linear_program.main;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class Main78 {

    private static String removeReplays(String line) {
        StringBuilder strBuilder = new StringBuilder(line);
        for (int i = 0; i < strBuilder.length(); i++) {
            char ch = strBuilder.charAt(i);
            if (ch == ' ') {
                strBuilder.deleteCharAt(i);                            // удаляем пробелы
                i--;
                continue;
            }
            for (int j = i + 1; j < strBuilder.length(); j++) {
                if (strBuilder.charAt(j) == ch) {
                    strBuilder.deleteCharAt(j);                        //удаляем повторяющиеся символы
                }
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "Вводится строка. Требуется удалить из нее повторяющиеся символы " +
                "и все пробелы. Например, если было введено \"abc cde def\", то " +
                "должно быть выведено \"abcdef\"";
        System.out.println(removeReplays(line));
    }
}