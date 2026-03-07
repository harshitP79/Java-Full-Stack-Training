
import java.util.Scanner;



public class Problem31 {
    public static void main(String[] args) {
        /* WAJP to check if a number is Palindrome or not */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev=0;
        while(temp!=0){
            int digit = temp % 10;
            rev = rev*10 +  digit;
            temp/=10;
        }
        if(rev==n){
            System.out.println("The number is palindrome!");
        }else{
            System.out.println("Not a palindrome!");
        }

        /* WAJP to print all palindrome number from the range 1 to 1000 */
        for(int i = 1;i<=1000;i++){
            int temp1 = i;
        int rev1=0;
        while(temp1!=0){
            int digit = temp1 % 10;
            rev1 = rev1*10 +  digit;
            temp1/=10;
        }
        if(rev1==i){
            System.out.print(i+" ");
        }
        }
    }
}
