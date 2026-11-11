import java.util.Scanner;
public class OctalDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an octal number:");
        int octal = sc.nextInt();
        int decimal = 0 ;
        int base = 1;
         while (octal>0){
            int rem = octal % 10;
            decimal= decimal+(rem*base);
            base = base*8;
            octal = octal/10;
         }   
         System.out.println("Decimal number="+ decimal);
         sc.close();



               
    }
}