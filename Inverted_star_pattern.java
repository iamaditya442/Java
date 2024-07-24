import java.util.*;
public class Inverted_star_pattern {
    public static void main(String args[]){
        System.out.println("Enter the number to print number of stars : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i = a ;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }
}
