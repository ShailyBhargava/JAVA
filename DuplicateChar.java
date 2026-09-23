import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = ob.next();
        for(int i=0;i< s.length();i++){
            for (int j = i+1; j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println("Duplicate Value :"+s.charAt(i));
                }
            }

        }

    }
    
}
