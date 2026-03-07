
import java.util.Scanner;


public class Problem33 {

    /*Write a program to Check Given Number is a Xylem or Phloem  Number. and return a suitable message.
Explanation:-
A number N will be a xylem number if the sum of its extreme (first and last) digits is equal to the sum of mean means digits present in the middle other than first and last digit(all digits except first and last) digits. If the sum of extreme digits is not equal to the sum of mean digits, the number is called phloem number.
Check Inner sum and Outer sum are the same or not. Both are the same return(String return type) 1 otherwise 0.
1 --> xylem number
0 --> phloem number


Example:-

         int num = 12341
         outer values = 1,1-----> add both 1+1=2 --->outer sum is 2.
         inner values = 2,3,4----->  add those 2+3+4 ----->inner sum is 9.
         compare both inner and outer 
         Both are not equal. So, return 0.
         if both are equal, So,return 1 . */
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int out = temp % 10;
        temp /=10;
        int innersum=0;
        while(temp>10){
            int digit = temp % 10;
            innersum+=digit;
            temp /=10;
        }
        int outersum = out + temp;
        if(outersum == innersum){
            System.out.println("Xylem number");
        }else{
            System.out.println("Pholem number");
        }
    }
}
