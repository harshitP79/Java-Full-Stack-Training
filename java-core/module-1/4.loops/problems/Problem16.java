
import java.util.Scanner;

public class Problem16 {

    public static void main(String[] args) {
        /* Given an integer n, return the number of prime numbers that are strictly less than n. 
        ex:
        Input: n = 10
        output: 4
        Expalantion: There are 4 prime numbers less than 10 they are 2 3 5 7
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count1 = 0;
        for (int i = n; i >= 1; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
