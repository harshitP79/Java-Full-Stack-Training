import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        /* WAJP to find factor of a number */
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The factors of " + n + " is: ");
        for(int i = 1 ;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }    
}
