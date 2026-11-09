import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number");
        int start = sc.nextInt();

        System.out.println("enter ending number");
        int end = sc.nextInt();

        for(int n = start;n<=end;n++){
            int temp = n;
            int digits =0;
            int sum = 0;
            int count = n;
            while(count >0){
                digits++;
                count=count/10;
            }
            if(n==0){
                digits =1;
            }
            temp = n;
            while (temp > 0){
                int digit = temp %10;
                sum+=(int)Math.pow(digit,digits);
                temp = temp/10;

            }
            if(sum ==n){
                System.out.println(n);
            }
        }
    }
}