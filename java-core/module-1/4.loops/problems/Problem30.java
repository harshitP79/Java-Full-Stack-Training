import java.util.Scanner;

public class Problem30 {
    /*Strong number
    145 is an strong number
    Sum of factorial of each digit is equals to original number hence it is an Strong number!
    5! = 
    4! = 
    1! =

    */

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =s.nextInt();
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            int factorial = 1;
            for(int i = digit;i>=1;i--){
                factorial*= i;
            }
            sum+=factorial;
            temp/=10;
        } 
        if(sum==n){
            System.out.println("This number is an String  number!");
        }
        else{
            System.out.println("Not an Strong number!");
        }


        System.out.println("Strong numbers in range 1 to 1000: ");
        /* WAJP to print every Strong numbers in range 1 to 1000 */
        for(int i = 1;i<=1000;i++){
            int temp1 = i;
            int sum1 = 0;
            while(temp1 != 0){
                int digit = temp1 % 10;
                int factorial = 1;
                for(int j = digit;j>=1;j--){
                    factorial*= j;
                }
                sum1+=factorial;
                temp1/=10;
            } 
            if(sum1==i){
                System.out.print(i+" ");
            }
        }
    }
}
