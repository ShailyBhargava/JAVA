import java.util.Scanner;
public class CharToString{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an character:");
        char ch = sc.next().charAt(0);

        String s = ""+ch;
        System.out.println("String=" + s);
        

    }
}