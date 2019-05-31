package extra.sorting_algos;

public class BubbleSort {

    private void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                System.out.print("Step " + (j + 1) + ": ");
                print(arr);
            }
        }
    }

    private void print(int[] arr) {
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {34, 23, 65, 12, 87};
        System.out.print("Input: ");
        bs.print(arr);
        bs.sort(arr);
    }
}
