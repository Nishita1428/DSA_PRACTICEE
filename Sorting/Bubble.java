import java.util.*;

public class Bubble {
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int turn = 0;  turn < n-1; turn++){
             for(int i = 0;i <n-1; i++){
                for(int j = i+1; j<n; j++){
                    if(arr[j] < arr[i]){
                        
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
             }
        }

    }
    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
      
        BubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
    }
}
