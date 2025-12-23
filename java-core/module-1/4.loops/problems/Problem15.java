
public class Problem15 {

    /* WAJP to find the prime numbers from the range 20 to 1 */
    public static void main(String[] args) {

        for (int i = 20; i >= 1; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }

        }
    }
}
