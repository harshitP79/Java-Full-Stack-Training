class Problem21{
    public static void main(String[] args) {
        /* WAJP to print factorial of odd numbers between from the range 10 to 1 */

        for(int i =14;i>=5;i--){
            int factorial = 1;
            if(i%2==1){
                
                for(int j = i ;j>=1;j--){
                    factorial *=j;
                }
                
            System.out.println(factorial);
            }
        }

    }
}