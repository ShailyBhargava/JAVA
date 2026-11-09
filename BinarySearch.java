import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,78,99,33,20,56,14};
        System.out.println("Enter number to search:");
        int key = sc.nextInt();
        int low = 0 ;
        int high = arr.length-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                index = mid;
                break;
            }
            else if(arr[mid]<key){
                low = mid +1;
            }
            else{
                high = mid - 1;

            }
        }

        if(index!=-1){
            System.out.println("Element found at index:" + index);
        }
        else{
            System.out.print("element not found:");
        }
        
    }
    
}
