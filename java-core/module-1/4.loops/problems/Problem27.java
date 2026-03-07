
import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        /* special number
        19 is a special number
        1 9
        sum of the digits is 10 
        product od the digits is 9
        total = sum of digit + product of digit
        total = 10 + 9
        total is 19 and is equals to our original number. hence 19 is a special number.


        
        */

        /* WAJP to chheck if the number is a special number or not */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum=0;
        int product=1;
        int total;
        while(temp!=0){
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        total = sum + product;
        if(total==n){
            System.out.println("This number is a special number!");
        }else{
            System.out.println("Not a special number");
        }


        for(int i = 0 ;i<=100;i++){
    
        int temp1 = i;
        int sum1=0;
        int product1=1;
        int total1;
        while(temp1!=0){
            int digit = temp1 % 10;
            sum1 += digit;
            product1 *= digit;
            temp1 /= 10;
        }
        total1 = sum1 + product1;
        if(total1==i)
        {
            System.out.println(i);
        }
        }
    }
}
