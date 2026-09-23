import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in );
        System.out.println("Enter a number");
        int n = ob.nextInt();
        System.out.println("Enter Power");
        int p = ob.nextInt();
        int result = 1;
        for(int i = 1; i<=p; i ++){
            result = result*n;
        }
        System.out.println("Result is ="+ result);
    }
}