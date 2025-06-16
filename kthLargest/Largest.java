
public class Largest {

    public static int KthLargest(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[arr.length - k] ;// 8 - 2 = 6
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 13, 0, 6, 5, 23 };
        System.out.println(KthLargest(arr, 4));
    }
}


// 6 => 