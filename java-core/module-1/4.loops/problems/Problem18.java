
public class Problem18 {

    public static void main(String[] args) {
        /*WAJP to find Perfect number between the range 1 to 100 */
        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            } 
        }
    }
}
