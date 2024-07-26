import java.util.*;
public class Pairs_of_array_numbers_26_07_2024 {
    public static void arrayPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int current = numbers[i];{
                for(int j=i+1;j<numbers.length;j++){
                    System.out.print("("+current+","+numbers[j]+")  ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,4,8,9,10};
        arrayPairs(numbers);
    }
}
