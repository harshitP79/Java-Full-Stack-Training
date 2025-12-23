
public class Problem2 {
    /* WAJP to print char from the range 
    A to M
    x to m */

    public static void main(String[] args) {
        char i = 'A';
        while(i<='M'){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("");
        System.out.println("---------------------");
        i = 'x';
        while(i>='m'){
            System.out.print(i+ " ");
            i--;
        }
    }
}
