import java.util.Scanner;
public class RQ{
    public static void main(String[] args){
    Scanner ob = new Scanner(System.in);
   
    System.out.print("Enter 1st number :");
    int a = ob.nextInt();
    System.out.print("Enter 2nd number :");
    int b = ob.nextInt();
    
    int Qoutient = a/b;
    int remainder = a%b;
    System.out.println("Qoutient is" + Qoutient);
    System.out.println("Remainder is" + remainder);
    
    }
}