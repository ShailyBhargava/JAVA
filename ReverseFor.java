import java.util.Scanner;
public class ReverseFor{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Ener a number:");
        int n = ob.nextInt();
        int rev= 0;
        for(;n!=0;n=n/10){
            int digit = n%10;
            rev = rev*10+digit;
        
        }
        System.out.println(rev);
    }
}