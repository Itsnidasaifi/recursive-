public class reverseArray2 {

    static void reverse(int arr[], int n, int i) {

        if (i >= n / 2) {
            return;

        }
        swap(arr, i, n - i - 1);
        reverse(arr, n, i + 1);

    }

    static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 67, 78 };
        int n = arr.length;
        int i = 0;
        reverse(arr, n, i);

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "");

        }

    }

}
