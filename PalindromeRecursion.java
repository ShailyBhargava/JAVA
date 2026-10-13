
import java.util.Scanner;

public class PalindromeRecursion{
    static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = ob.nextInt();
        System.out.println("Factorial="+ fact(n));
    }
}