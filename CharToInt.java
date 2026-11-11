import java.util.Scanner;
public class CharToInt{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an character:");
        char ch = sc.next().charAt(0);

        int n = ch;
        System.out.println("Integer=" + n);
        

    }
}