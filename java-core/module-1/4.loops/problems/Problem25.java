public class Problem25 {
    public static void main(String[] args) {
        /*WAJP to find smallest digit  from given number */
        int n = 23823;
        int smallest= Integer.MAX_VALUE;
        while(n!=0){
            int digit = n % 10;
            if(smallest>digit){
                smallest = digit;
            }
            n/=10;
        }
        System.out.println("The smallest Digit is: " + smallest);

        /*Largest Digit */

         n = 23823;
        int Largest= Integer.MIN_VALUE;
        while(n!=0){
            int digit = n % 10;
            if(Largest<digit){
                Largest = digit;
            }
            n/=10;
        }
        System.out.println("The smallest Digit is: " + Largest);

        
    }
}
