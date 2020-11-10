package by.epam.linear_program.main;

// 3. Проверить, является ли заданное слово палиндромом
class Palindrome {

    public static void main(String[] args) {
        Palindrome word = new Palindrome();

        if (word.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private boolean isPalindrome() {
        int i = "abcddfbca".length() - 1;
        int j = 0;
        while (i > j) {
            if ("abcddfbca".charAt(i) != "abcddfbca".charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}