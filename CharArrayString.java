import java.util.Scanner;

public class CharArrayString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number of character:");
        int n = ob.nextInt();
        char[]arr = new char[n];
        System.out.print("Enter Array:");
        for(int i = 0 ;i<n;i++){
            arr[i]=ob.next().charAt(0);
        }
        String s = "";
        for(int i = 0;i<n;i++){
            s = s +arr[i];
        }
        System.out.println( "String "+"\""+s+ "\"");
    }
    
}
