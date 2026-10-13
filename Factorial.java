import java.util.Scanner;
public class Factorial{
    static int Fact(int n ){
        if(n==0||n==1){
            return 1;
        }
        return n*Fact(n-1);
    }

    public static void main(String[] args){
        Scanner o = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = o.nextInt();
        System.out.println("Factrial is :" + Fact(n));

    }
}