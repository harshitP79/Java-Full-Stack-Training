
import java.util.Scanner;


public class Problem14 {
    /* WAJP to check if the given number is prime number */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int n =  sc.nextInt();
        int count =0;
        if(n == 1){
            System.out.println(" 1 is a unique number ");
            return;
        }
        for(int i  = 2 ;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("The number is a prime number.");
        }else{
            System.out.println("The number is not a prime number.");
        }
    }
}
