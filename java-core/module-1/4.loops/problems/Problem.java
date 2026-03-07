
public class Problem{
    //WAJP to print numbers from the range
    /* 
    -123 to -129
    79 to 84
    -110 to -100
    0 to -9 
    using while loop
    */
    public static void main(String[] args) {
        int i = -123;
        while (i>=-129) {
            System.out.println(i);
            i--;
        }

        System.out.println("------------------------------");
        int j = 79;
        while (j<=84) {
            System.out.println(j);
            j++;
        }
        System.out.println("------------------------------");
        int k = -110;
        while (k<=-100) {
            System.out.println(k);
            k++;
        }
        System.out.println("------------------------------");
        int l = 0;
        while (l>=-9) {
            System.out.println(l);
            l--;
        }
        
    }
}
