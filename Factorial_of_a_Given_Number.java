import java.util.*;
public class Factorial_of_a_Given_Number {
    public static int factorialOfNumber(int number){
        int factorial = 1;
        for(int i = 1; i<=number;i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]){
        System.out.println("Enter the number to calculate the factorial : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int fact = factorialOfNumber(num);
        System.out.println("Factorial of the given number is : " + fact);
    }
}
