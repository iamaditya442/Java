import java.util.*;
public class Binary_search_26_07_2024 {
    public static int binarySearch(int numbers[],int key){
        int start = 0; int end = numbers.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,45,49,58,66,78,83,95};
        int key=83;
        System.out.println("Element is found at : "+ binarySearch(numbers,key));
    }
}
