import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.print("It is a Digit");
        }
        else if (Character.isLetter(ch)) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.print("Vowel");
            }
            else {
                System.out.print("Consonant");
            }
        }
        else {
            System.out.print("Special Character");
        }

       
    }
}
    