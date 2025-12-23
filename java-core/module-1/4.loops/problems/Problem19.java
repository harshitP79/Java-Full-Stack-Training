
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        /*
        WAJP to find Factorial of a Number
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        long temp = 1;
        for(long  i = n ; i>=1;i--){
            temp*=i;
        }
        System.out.println("The Factorial is:" + temp);
    }
}
