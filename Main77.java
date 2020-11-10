package by.epam.linear_program.main;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Main77 {
    private static String repeatCharacter(String line, int factor) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < factor; j++) {
                strBuilder.append(line.charAt(i));
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String line = "Get a new one from the specified string by repeating each character twice";
        System.out.println(repeatCharacter(line, 2));
    }
}