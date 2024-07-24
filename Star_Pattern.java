import java.util.*;
public class Star_Pattern {
    public static void main(String args[]){
        System.out.println("Enter the number to print star pattern :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }System.out.println(" ");
        }
    }
}
