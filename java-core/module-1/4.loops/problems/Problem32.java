public class Problem32 {
    public static void main(String[] args) {
        /* WAJP to input a number and check and print whether it is an abundant number or not. 
        Output:
            return 1 if it is a abundant number.
            return 0 if it is not an Abundant number.

        Explaination:
        An abundant number is a number for which the sum of its proper factors is greater than the number itself.
        Example:
        Consider the number 12.
        factors of 12 = 1, 2 ,3 , 4,6 

        */
       int n = 12;
       int sum = 0;
       for(int i =  0;i<=n/2;i++){
        if(n%i==0){
            sum+=i;
        }
       }
       if(sum>n){
        System.out.println(n+ " is an abundant number.");
       }else{
        System.out.println(n+" is not an abundant number.");
       }

    }
}
