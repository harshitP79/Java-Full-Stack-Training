
import java.util.Scanner;

public class Problem12Assignment {
    /*
    Given a number n for each integer i in the range of 1 to n inclusive, print out one value per 
    if i is a multiple of both 3 and 5, print FizzBuzz
    if i is a multiple of 3 not 5, print Fizz
    if i is a multiple of 5 not 3, print Buzz
    if i is a multiple of both 3 and 5, print the value of i
    
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n range: ");
        int n = sc.nextInt();

        for(int i = 1 ;i<=n;i++){
            if(i%3==0 || i%5==0){
                if(i%5==0 && i%3==0){
                    System.out.println("FizzBuzz");
                }else if(i%3==0 && i%5!=0){
                    System.out.println("Fizz");
                }else{
                    System.out.println("Buzz");
                }
            }else{
                System.out.println(i);
            }
        }
    }
}
