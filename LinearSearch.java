import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={22,74,99,20,88};
        System.out.println("Enter a Element you want to find: ");
        int key = sc.nextInt();
        int index = -1;

        for (int i =0 ;i<arr.length;i++){
         if(arr[i]==key){
            index = i;
            break;
         }
        }
        if(index != -1){
            System.out.println("Element found at index" +  index );
        }
        else{
            System.out.println("Element not Found");
        }

    }
}