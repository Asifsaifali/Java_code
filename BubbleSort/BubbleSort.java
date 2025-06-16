public class BubbleSort {

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                return;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 3, 0, 6, 5, 23 };
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
