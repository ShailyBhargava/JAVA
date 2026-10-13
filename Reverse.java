
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner ob = new  Scanner(System.in);
        System.out.println("Enter a String:");
        String s = ob.next();

        String rev= " ";
        for(int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);

        }
    System.out.println("Reverse String is ="+rev);
    }
    
}
