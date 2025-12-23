
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        /*
        Perfect number: 6
        sum of the factors : 1+2+3 = 6
        sum of the factors is equals to original number hence the number is a perfect number. 
        WAJP to check for perfect number
        */
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum == n){
            System.out.println("Perfect Number!");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}
