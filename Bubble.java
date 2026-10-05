public class Bubble { 
    public static void main(String[] args){
        int a[] = {2,1,8,9,5};
        int size = a.length;
        int temp = 0;
        System.out.println("Before sorting");
        for (int n : a ){
            System.out.print(n + " ");

        }
 
     
 for (int i = 0 ; i<size;i++)
    { 
     for (int j = 0 ; j<size-1;j++){
        if(a[j]>a[j+1]){ 

            temp = a[j];
            a[j] = a[j+1];
            a[j+1] =temp;

        }
     }

 }

        System.out.println();
       System.out.println("After sorting");
        for (int n : a ){
            System.out.print(n + " ");
        }

    }
    
}
