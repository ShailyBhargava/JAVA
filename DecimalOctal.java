import java.util.Scanner;

public class DecimalOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number");
        int num = sc.nextInt();
         int octal = 0 ;
         int base = 1;
         while (num>0){
            int rem =num%8;
            octal = octal+(rem*base);
            base = base*10;
            num = num/8;

         }
         System.out.println("Octal number="+octal);


    }
    
}
