
public class Problem4 {
    public static void main(String[] args) {

        /* WAJP to print char fro the range s to l and T to Z */
        char i = 's';
        do{
            System.out.println(i);
            i--;
        }while(i>='l');

        System.out.println("____________");

        i = 'T';
        do{
            System.out.println(i);
            i++;
        }while(i<='Z');
    }
}
