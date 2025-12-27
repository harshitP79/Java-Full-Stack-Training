public class Problem8 {
    /*101. WAJP to find count of elements which are divisible by k.
	INPUT :  
	int n=7
	int[] a=9,-13,8,-7,-8,18,10
	int k = 18

	OUTPUT: 2 */

    public static void main(String[] args) {
        int n = 7;
        int[] a = {9, -13, 8, -7, -8, 18, 10};
        int k = 18;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }

        System.out.println("Count of elements divisible by " + k + " is: " + count);
    }
}
