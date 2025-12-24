
import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        /* Disarium number*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int temp =n;
        int temp1=n;
        int count = 0;
        while(temp!=0){
            count ++;
            temp/=10;
        }
        int sum=0;
        while(temp1 != 0){
            int digit = temp1% 10;
            sum += Math.pow(digit, count);
            count--;
            temp1 /= 10;
        }
        if(sum == n){
            System.out.println("The number is disarium number");
        }else{
            System.out.println("Not a disarium number!");
        }

    }
}
