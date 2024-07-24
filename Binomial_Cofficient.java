import java.util.*;
public class Binomial_Cofficient {
    public static int binomialCoefficient(int n , int r){
        int a = 1;
        int b = 1;
        int c = 1;
        int d = n-r;
        for(int i=1;i<=n;i++){
            a = a * i;
        }
        for(int j=1;j<=r;j++){
            b = b * j;
        }
        for(int k=1;k<=d;k++){
            c = c * k;
        }
        int FinalAnswer = a / (b*c);
        return FinalAnswer;
    }
    public static void main(String args[]){
        System.out.println("Enter the value of n : ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println("Enter the value of r : ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        int Result = binomialCoefficient(x,y);
        System.out.println("So the Binomial Coefficient of the given numbers is : " + Result );
    }
}
