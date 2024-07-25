import java.util.*;
public class Half_Pyramid_Pattern {
    public static void main(String args[]){
        System.out.println("Enter the number to print pattern : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char ch = 'A';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }System.out.println(" ");
        }
    }
}
