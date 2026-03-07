
import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        /* WAJP to find the factorial of digits inside a number*/
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =s.nextInt();
        int temp = n;
        while(temp != 0){
            int digit = temp % 10;
            int factorial = 1;
            for(int i = digit;i>=1;i--){
                factorial*= i;
            }
            System.out.println(digit+ " Factorial is :"+factorial);
            temp/=10;
        } 
    }
}
