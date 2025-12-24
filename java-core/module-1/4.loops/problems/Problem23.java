public class Problem23 {
    public static void main(String[] args) {
        /* WAJP to seprate digits of a number */
        int n = 122313;
        while(n!=0){
            int digit = n % 10;
            System.out.println(digit);
            n = n /10;
        }
        /* even Digits */
        System.out.println("Even digits");
        n = 123232;
        while(n!=0){
            int digit = n % 10;
            if(digit%2==0){
            System.out.println(digit);
            }
            n = n /10;
        }
        

        /* Prime digit */
        System.out.println("Prime Digits:");
        n = 1234567890;

        while(n!=0){
            int digit = n % 10;
            int count = 0;
            for(int i =1;i<=digit;i++){
                if(digit%i==0){
                    count ++;
                }
            }
            if(count==2){
                System.out.println(digit);
            }
            n = n / 10;
        }
        
        /*Sum of all Digits */
        n  = 123456789;
        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum += digit;
            n = n /10;
        }
        System.out.println("Sum of all Digits is: "  + sum);
    }
}
