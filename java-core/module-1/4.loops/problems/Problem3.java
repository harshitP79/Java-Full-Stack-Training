
public class Problem3 {
    public static void main(String[] args) {
        /*WAJP to print numbers from the range 
        -111 to -101
        123 to 113
        5 to -5
        -10 to 0
        using do while loop
        */
        int i = -111;
        do{
            System.out.println(i);
            i++;
        }while(i<=-101);
        System.out.println("--------");
        i = 123;
        do{
            System.out.println(i);
            i--;
        }while(i>=113);
        System.out.println("--------");
        i = 5;
        do{
            System.out.println(i);
            i--;
        }while(i>=-5);
        System.out.println("--------");
        i = -10;
        do{
            System.out.println(i);
            i++;
        }while(i<=0);
    }
}
