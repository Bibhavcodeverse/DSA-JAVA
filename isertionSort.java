 public class isertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements to the right to make space for current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current in its correct position
            arr[j + 1] = current;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
