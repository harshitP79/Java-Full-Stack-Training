
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter fruit name: ");
        // String fruit = sc.next();//Next for one word and Next line for sentence
        // switch (fruit) {
        //     case "apple":
        //         System.out.println("Apple is red or green.");
        //         break;
        //     case "banana":
        //         System.out.println("Banana is yellow.");
        //         break;
        //     case "grape":
        //         System.out.println("Grape is purple or green.");
        //         break;
        //     case "orange":
        //         System.out.println("Orange is orange.");
        //         break;
        //     default:
        //         System.out.println("Unknown fruit.");
        //         break;
        // }


        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("fair");
            case 'F':
                System.out.println("Fail");
                break;
            default:   
                System.out.println("Invalid grade");
                break;
    }

    //Swicth case is used to select one of many code blocks to be executed
    //Default is not mandatory and it can be placed anywhere in the switch case
    //we cannot use long, float, double and boolean data types in switch case
    //if we do not put break statement it will execute all the cases below the matched case (called fall through)
    //break statement is a control transfer statement.
}
}