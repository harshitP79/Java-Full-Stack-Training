public class Problem20 {
    public static void main(String[] args) {
        /*
        WAJP to print the factorial of all numbers from the range 1 to 10
        */
       for (int i = 1; i < 10; i++) {
        long temp = 1;
        for(long  j = i ; j>=1;j--){
            temp*=j;
        }
        System.out.println(temp);
       }
       
    }
}
