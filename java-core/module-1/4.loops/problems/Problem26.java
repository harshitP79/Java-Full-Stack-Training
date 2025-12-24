public class Problem26 {
    public static void main(String[] args) {
        /* WAJP to find the second largest digit  */
        int n = 932322;
        int smallest=Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        while(n%10!=0){
            int digit = n % 10;
            if(digit<smallest){
                second_smallest=smallest;
                smallest=digit;
            }else if(digit<second_smallest && smallest != digit){
                second_smallest=digit;
            }
            n /=10;
        }
        System.out.println("The secind smallest digit is: "+ second_smallest);
        
        /* WAJP to find the largest digit */

        n = 19932398;
        int largest=Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        while(n%10!=0){
            int digit = n % 10;
            if(digit>largest){
                second_largest=largest;
                largest=digit;
            }else if (digit>second_largest && largest>digit) {
                second_largest=digit;
            }
            n /=10;

        }
        System.out.println("The second largest digit is: "+ second_largest);
    }
}
