
import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b&&a>=c){
            System.out.println(a + " largest");
        }else if(b>=a&&b>=c){
            System.out.print(b +" largest");

        }
        else{
            System.out.println(c + " largest");
        }
    }
}
