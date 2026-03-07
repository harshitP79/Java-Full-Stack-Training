
import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        /* Niven Number 
        24 is  a niven number 
        sum of the digit is 6
        24%6==0, hence it is a niven number
        WAJP to check if a number is niven or not
        */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int temp = n;
        int sum=0;
        while(temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        if(n%sum==0){
            System.out.println("The number is a niven number!");

        }else{
            System.out.println("The number is not a niven number!");
        }
    }
}
