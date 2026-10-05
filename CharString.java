import java.util.Scanner;

public class CharString {
    public static void main(String[] args){
        //character to string
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = ob.next().charAt(0);
        
        String str = String.valueOf(ch);

        System.out.println("Character to String:"+ str);


        //string to character
        System.out.println("Enter a String:");
        String text = ob.next();
        
        char c = text.charAt(0);

        System.out.println("string to character:"+ c);


    }
    
}
