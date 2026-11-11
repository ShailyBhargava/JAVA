import java.util.Scanner;
public class HexaToDecimal{
    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter HexaDecimal number:");
        String hex = sc.nextLine();
        int decimal = 0;
        int base = 1;
        for (int i = hex.length()-1;i>=0;i--){
            int digit = Character.digit(hex.charAt(i),16);
            decimal= decimal+(digit*base);
            base = base *16;


        }
        System.out.println("Decimal number="+decimal);
    }

}