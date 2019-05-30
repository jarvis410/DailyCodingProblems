package extra.sorting_algos;

public class InsertionSort {

    void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            print(arr);
        }
    }

    void print(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {5, 3, 7, 2, 9};
        System.out.print("Original: ");
        is.print(arr);
        is.sort(arr);
    }
}
