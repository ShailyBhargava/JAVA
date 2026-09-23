import java.util.Scanner;

public class Compoundinterest {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Principal:");
        double p = sc.nextDouble();
        System.out.print("Enter Rate:"); 
        double r = sc.nextDouble();
        System.out.print("Enter Time:");
        double t = sc.nextDouble();
        double amount = p*Math.pow((1+r/100), t);
        double Compoundinterest=amount-p;
        System.out.println("compound interest:" + Compoundinterest);
        System.out.print("total amount =" +amount);
      }
    
}
