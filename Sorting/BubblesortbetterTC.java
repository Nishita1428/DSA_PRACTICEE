import java.util.Arrays;

public class BubblesortbetterTC {
    
    
        public static void bubbleSort(int arr[]) {
            int n = arr.length;
            for(int turn = 0;  turn < n-1; turn++){
                 
                    for(int j = 0; j<n-1-turn; j++){
                        if(arr[j] > arr[j+1]){
                            
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                 
            }
            
        }

        public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
      
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
    }
    }

