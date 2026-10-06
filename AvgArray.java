
import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) {
        
         Scanner o = new Scanner(System.in);
        
        System.out.println("Enter size:");
        int n = o.nextInt();
        int a[] = new int[n];

        System.out.println("enter elements:");
        int sum = 0;
        for(int i = 0;i<n;i++){
            a[i]=o.nextInt();
            sum=sum+a[i];


        }
        double avg = (double) sum/n;
        System.out.println("Average="+avg);



    }
    
}
