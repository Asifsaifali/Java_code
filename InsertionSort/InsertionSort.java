public class InsertionSort {
    
    public static void InsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int currElement = arr[i];
           int j = i - 1;
            while(j >= 0 && arr[j] > currElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 3, 0, 6, 5, 23 };
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
