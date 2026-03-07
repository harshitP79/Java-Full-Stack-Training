
import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {
        /*
        WAJP to check the give n cahr is uppercase vowel, uppercase consonant lowercase vowel lowercase consonant 
        if the given char is uppercase vowel, print numbers from the range 10 to 20 using do while loop
        if the given char is lowercase vowel, print numbers from the range -10 to -20 using while loop
        if the given char is uppercase consonant, print numbers from the range 25  to 15 using for loop
        if the given char is lowercase consonant, print numbers from the range -25  to -15 using for loop
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        char c = sc.next().charAt(0);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                int i = -10;
                while (i >= -20) {
                    System.out.println("lowecase vowel Vlock:" + i);
                }
            } else {
                for (int i = -25; i <= -15; i++) {
                    System.out.println("lowercase consonant Block:" + i);
                }
            }
        } else {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                int i = 10;
                do {
                    System.out.println("Uppercase Vowel Block: " + i);
                    i++;
                } while (i <= 20);
            } else {
                for (int i = -25; i <= -15; i++) {
                    System.out.println("Uppercase Consonant BLock : i");
                }
            }
        }

    }
}
