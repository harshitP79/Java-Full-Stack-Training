public class Problem11 {

    public static int  reverseElements(int a) {
        int rev = 0;
        while(a!=0){
            int rem = a%10;
            rev = rev *10 + rem;
            a = a/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int arr1[] = {211, 2322, 332, 45334, 543};
        for(int i=0; i< arr1.length; i++){
            arr1[i] = reverseElements(arr1[i]);
        }  
        for(int i=0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
