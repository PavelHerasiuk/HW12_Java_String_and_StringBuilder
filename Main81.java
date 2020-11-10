package by.epam.linear_program.main;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class Main81 {
    private static int countSentences(String line) {
        int counter = 1;
        char[] marks = {'.', '!', '?'};
        for (int i = 0; i < line.length() - 1; i++) {
            char character = line.charAt(i);
            for (char mark : marks) {
                if (character == mark && (line.charAt(i + 1) == ' ' || line.charAt(i + 1) == 10)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String lineX = "Is this a test task? Of course! I won't count anything here. Let the code think. Ok!";
        System.out.println("The number of sentences in the line: " + countSentences(lineX));
    }
}