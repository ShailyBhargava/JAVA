import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = ob.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("<---Palindrome--->");
        }
        else{
            System.out.println("<---Not Palindrom--->");
        }



        
    }
    
}
