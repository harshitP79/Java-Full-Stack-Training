public class Problem24 {
    public static void main(String[] args) {

        /* WAJP to print the multiplication of the evensum of the digits and odd sum of the digits from a given number */
        int n = 2514795;
        int even_sum = 0;
        int odd_sum = 0;
        while (n!=0) { 
            int digit = n % 10;
            if(n%2==0){
                even_sum += digit;
            }else{
                odd_sum+= digit;
            }
            n /= 10;
        }
        System.out.println("The multiplication of the even sum and odd is  :" + even_sum * odd_sum);
    }
}
