
public class Problem5 {
    /* WAJP to print the odd numbers bw 1 to 1000 without using any loop **RECURSION** */
    public static void printOdd(int n){

        if(n%2==1){
            System.out.println(n);
        }
        if(n<1000){
            printOdd(n+1);
        }
        
    }
    public static void main(String[] args) {
        printOdd(1);
    }    
}
