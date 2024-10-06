

import java.util.Scanner;
import java.util.StringTokenizer;

public class  LW2Q5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a sentence to check if it is a palindrome:");
        String sentence = scanner.nextLine();


        String cleanedSentence = cleanSentence(sentence);


        if (isPalindrome(cleanedSentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        scanner.close();
    }


    public static String cleanSentence(String sentence) {
        StringBuilder cleaned = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:'\"-()"); // Use delimiters to split the words


        while (tokenizer.hasMoreTokens()) {
            cleaned.append(tokenizer.nextToken().toLowerCase());
        }

        return cleaned.toString();
    }


    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;


        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
