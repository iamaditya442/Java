import java.util.*;
public class Floyds_Triangle {
    public static void floydsTriamgle(int n){
        int p=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }System.out.println();
        }
    }
    public static void main(String args[]){
    floydsTriamgle(5);}
}