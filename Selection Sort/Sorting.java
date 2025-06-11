public class Sorting {
    
    public static int MinIndex(int[] arr, int start){
        int minIndex = start;
        for(int i = start+1; i<arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
public static void SelectionSort(int[] arr){
    for(int i = 0; i<arr.length; i++){
         int minIndex = MinIndex(arr, i);
         if(arr[i] > arr[minIndex]){
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
         }
    }
}
    public static void main(String[] args) {
        int[] arr = {14,2,31,92,6,81,52,4,9};
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
    }
}
