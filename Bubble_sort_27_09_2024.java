public class Bubble_sort_27_09_2024 {
    public static void bubbleSort(int[] numbers){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++)
            if(numbers[j] > numbers[j+1]){
                int temp = numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]=temp;
            }
        }
    }
    public static void intArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[] = {2,5,3,4,1};
        bubbleSort(numbers);
        intArr(numbers);
    }
}
