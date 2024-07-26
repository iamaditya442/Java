import java.util.*;

public class Reverse_array_26_07_2024 {
    public static void reverseArray(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1; // Correctly initialize end
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(numbers);
        System.out.print("Reversed array is: ");
        for (int i = 0; i < numbers.length; i++) { // Correct loop condition
            System.out.print(numbers[i] + " ");
        }
    }
}
