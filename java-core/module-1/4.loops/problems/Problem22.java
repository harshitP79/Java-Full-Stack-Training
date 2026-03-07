public class Problem22 {
    public static void main(String[] args) {
        /* WAJP to print addition of all prime numbers from the range 32 to 50 */
        int sum=0;
        for(int i = 32;i<=50;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            
            if(count==2){
                sum+=i;
            }
            
        }
        System.out.println(sum);
    }
}
