import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Decimal Number:");
        int num=sc.nextInt();

        String hex ="";
        char digit;

        while (num>0){
          
            int rem=num % 16; 
              
            if(rem<10) {
                digit=(char)(rem+'0');
            }
            else{
                digit=(char)(rem-10+'A');
            }
            
            hex=digit+hex;

            num=num /16;

         
        }
        System.out.println("Hexadecimal number="+
       hex);

           sc.close();
    }
    
}
