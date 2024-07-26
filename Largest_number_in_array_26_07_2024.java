import java.util.*;
public class Largest_number_in_array_26_07_2024 {
    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
         if(largest<numbers[i]){
             largest=numbers[i];
         }
        }return largest;
    }
    public static void main(String args[]){
        int numbers[] = {5,1,4,89,5,47,1,8,8,4,5};
        System.out.println("Largest number is : " + largestNumber(numbers));
    }
}
