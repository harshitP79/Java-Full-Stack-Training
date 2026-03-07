
public class Problem6 {
    public static void main(String[] args) {
        /* WAJP to print char from the range 
        d to j
        m to e
        z to t
        r to x
        */

        for( char  i = 'd';i<='j';i++){
            System.out.println(i);
        } 
        System.out.println("-----------");
        for( char  i = 'm';i>='e';i--){
            System.out.println(i);
        } 
        System.out.println("-----------");
        for( char  i = 'z';i>='t';i--){
            System.out.println(i);
        } 
        System.out.println("-----------");
        for( char  i = 'r';i<='x';i++){
            System.out.println(i);
        } 
    }
}
