
import java.util.Scanner;

public class ReverseStringRecursion {
    static void reverse(String s , int i ){
        if(i<0){
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s,i-1);
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = ob.nextLine();
        reverse(s,s.length()-1);
    }
}
