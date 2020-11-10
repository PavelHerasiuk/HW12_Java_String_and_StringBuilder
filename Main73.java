package by.epam.linear_program.main;

//2. В строке вставить после каждого символа 'a' символ 'b'.
public class Main73 {
    private static String addSymbol(String line) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                strBuilder.append("aB"); // Для наглядности b будет в верхнем регистре.
            } else {
                strBuilder.append(line.charAt(i));
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "In the string, insert the 'b'character after each 'a' character";
        System.out.println(addSymbol(line));
    }
}