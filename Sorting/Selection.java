import java.util.*;

public class Selection {
    public static void SelectionSort(int arr[]){
         int n = arr.length;

         for(int i = 0 ; i<n-1; i++){
            int minpos = i;
            for(int j = i+1 ; j<n; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]= arr[i];
            arr[i] = temp;
         }
    }
    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
        SelectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
       
    }
    
}
