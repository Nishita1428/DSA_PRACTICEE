import java.util.*;

public class Insertion {
    public static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i<n ; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

    }
    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
        InsertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
    }
}
