import java.util.Scanner;
public class AddMatrice {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        System.out.println("Enter Elements of first matrix:");
        for(int i = 0 ;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("Enter Elements of Second matrix:");
        for(int i = 0 ;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=ob.nextInt();
            }
        }
        for(int i = 0 ;i<2;i++){
            for(int j=0;j<2;j++){
               c[i][j]= a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of two matrices:");
        for(int i = 0 ;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println(c[i][j] + "");
            }
            System.out.println();
        }


    }
    
}
