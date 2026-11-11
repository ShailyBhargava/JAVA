import java.util.Scanner;

public class LongToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long integer:");
        long num = sc.nextLong();
        int result = (int)num;
        System.out.println("Integer is="+result);
    }
    
}
