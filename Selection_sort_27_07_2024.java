public class Selection_sort_27_07_2024 {
    public static void selectionSort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < numbers.length; j++) { // Fixed condition
                if (numbers[minPosition] > numbers[j]) {
                    minPosition = j;
                }
            }
            // Swap only if minPosition has changed
            if (minPosition != i) {
                int temp = numbers[minPosition];
                numbers[minPosition] = numbers[i];
                numbers[i] = temp;
            }
        }
    }

    public static void intArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = {5, 3, 8, 6, 2, 7, 9, 3};
        selectionSort(numbers);
        intArr(numbers);
    }
}
