import java.util.Scanner;
public class SqrRoot{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int root = 0;
         for (int i = 1;i<=n;i++){
            if(i*i==n){
                root=i;
                break;
            }
         }
         if(root!=0||n==0){
            System.out.println("Square root");
         }
         else{
            System.out.println("not perfect square");
         }
    }
}