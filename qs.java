public class qs {
    static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quicksort(arr, start, pi-1);
            quicksort(arr, pi+1, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pIndex = (start - 1);
        int pivot = arr[end];

        for (int i=start; i<end; i++) {
            if(arr[i] < pivot) {
                pIndex++;
                swap(arr, pIndex, i);
            }
        }
        swap(arr, pIndex+1, end);
        return (pIndex+1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        // int[] arr = {2, 8, 7, 1, 3, 5, 6, 4};
        int[] arr = {3, 56, 12, 42, 7, 5, 90, 62};
        int start = 0;
        int end = 7;

        quicksort(arr, start, end);

        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
