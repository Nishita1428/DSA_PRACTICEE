public class Largestelement {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
     }

     public static void main(String[] args) {
        int arr[] = {19, 43, 30, 70, 65};
        System.out.println("Largest element in the array is: " + largest(arr));
     }
}
