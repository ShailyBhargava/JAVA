import java.util.Scanner;
public class GCD {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();
        System.out.println("enter first number:");
        int b = sc.nextInt();
        int n1=a ,n2= b ;
        while(n2!=0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;

        }
        int gcd = n1;
        System.out.println(gcd);
    }
    
}
