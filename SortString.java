import java.util.Scanner;
public class SortString{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = ob.next();
        for (char x = 'a';x<='z';x++){
            for (int i = 0 ; i< s.length();i++){
                char c = s.charAt(i);
                if (c==x){
                    System.out.print(c);
                }
            }
        }

    }
}