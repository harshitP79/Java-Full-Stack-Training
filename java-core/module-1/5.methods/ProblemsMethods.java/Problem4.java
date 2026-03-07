
public class Problem4 {

    /*WAJP to print all the numbers from the range 1 to 1000 without using any loop **RECURSION** */

    public static void  printNum(int n){
        if(n<=1000){
            System.out.println(n);
            printNum(n+1);
        }
    }
    public static void main(String[] args) {
        printNum(1);
    }
}
