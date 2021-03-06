package extra.sorting_algos;

public class SelectionSort {

    void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swapping
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.print("Pass "+(i+1)+": ");
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
        SelectionSort ss = new SelectionSort();
        int[] arr = {23, 12, 45, 24, 17};
        System.out.print("Original: ");
        ss.print(arr);
        ss.sort(arr);
    }
}
