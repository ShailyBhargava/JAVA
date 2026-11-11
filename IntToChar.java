import java.util.Scanner;
public class IntToChar{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        char ch = (char)n;
        System.out.println("Character=" + ch);
        

    }
}