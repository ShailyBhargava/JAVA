import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number");
        int num = sc.nextInt();
        int decimal = 0;
        int base = 1;
        while(num>0){
            int rem = num%10;
            decimal=decimal+(rem*base);
            base = base*2;
            num = num/10;
        }
        int octal = 0;
        base = 1;
        while(decimal>0){
            int rem = decimal%8;
            octal = octal+(rem*base);
            base = base*10;
            decimal = decimal/8;

        }
        System.out.println("Octal numbeer="+octal);
    }
    
}
