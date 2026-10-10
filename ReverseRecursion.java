import java.util.Scanner;

public class ReverseRecursion { 
    static int reverse(int n , int rev){
        if(n==0){
            return rev;
        }
        int digit = n%10;
        rev= rev*10+digit;
        return reverse(n/10,rev);
    }
    
    
public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter A number:");
        int n = ob.nextInt();
        int result = reverse(n,0);
        System.out.println(result);
        
    }
}