

import java.util.Scanner;

public class Vowelconsonantcount{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = ob.nextLine();

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (!Character.isLetter(ch)) {
                System.out.println("Input must contain only alphabetical letters.");
               
                return;
            }

            
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowel++;
            }
            else {
                consonant++;
            }
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);

        
    }
}
