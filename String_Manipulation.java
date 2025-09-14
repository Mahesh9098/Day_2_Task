import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        int vowels = 0, consonants = 0;
        String strLower = input.toLowerCase();

        for (int i = 0; i < strLower.length(); i++) {
            char ch = strLower.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        System.out.println("\n--- Results ---");
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        if (isPalindrome) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
