import java.util.*;
public class Sub_Arrays_26_07_2024 {
    public static void subArray(int numbers[]){
        for (int i=0;i<numbers.length;i++){
            int start=i;{
                for(int j=i+1;j<numbers.length;j++){
                    int end=j;{
                        for (int k=start;k<=end;k++){
                            System.out.print(numbers[k]+" ");
                        }
                    }System.out.println();
                }System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,4,5,6,7,8,9};
        subArray(numbers);
    }
}
