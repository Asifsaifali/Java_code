public class Inversion {
    public static int count = 0;
public static int[] MergeSort(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                count += (arr1.length - i);
                result[k++] = arr2[j++];
            }
        }

        while (i < m) {
            result[k++] = arr1[i++];
        }

        while (j < n) {
            result[k++] = arr2[j++];
        }
        return result;
    }

public static int[] f(int[] arr, int start, int end){
    if(end == start){
        int[] res = new int[1];
        res[0] = arr[start];
        return res;
    }
    int mid = (start + end)/2;
    int[] left =  f(arr, start, mid);
    int[] right = f(arr, mid+1, end);
    return MergeSort(left, right);
}

    public static void mergeSort(int[] arr){
        int[] result = f(arr, 0, arr.length-1);
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            arr[i] = result[k++];
         }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, -1, 5, 9, 8, 0 };
        mergeSort(arr);
    
        System.out.println("Total number of Inversion count is: " + count );
    }
}
