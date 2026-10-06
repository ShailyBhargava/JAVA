
import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args) {
        
         Scanner o = new Scanner(System.in);
        
        System.out.println("Enter size:");
        int n = o.nextInt();
        int a[] = new int[n];

        System.out.print("enter elements:");
      
        for(int i = 0;i<n;i++){
            a[i]=o.nextInt();
           
        }
        System.out.println("Reverse Array:");
        for(int i =n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        
        
       //0 double avg = (double) sum/n;
        //System.out.println("Average="+avg);



    }
    
}
