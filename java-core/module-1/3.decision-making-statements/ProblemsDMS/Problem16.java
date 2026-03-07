
import java.util.Scanner;

public class Problem16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select Your Operation(1,2,3,4): \n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Addition: \nSelect the number of variables you want for Addition operation: \n (Eg: 2 var->a+b, 3var->a+b+c, 4var->a+b+c) \n type: 2 3 4");
                int varNum = sc.nextInt();
                switch (varNum) {
                    case 2:
                        System.out.println("Enter the 2 Variables with a space between :");
                        double a1 = sc.nextInt();
                        double b1 = sc.nextInt();
                        double sum1 = a1 + b1;
                        System.out.println("The ans is : " + sum1);
                        break;
                    case 3:
                        System.out.println("Enter the 3 Variables with a space between :");
                        double a2 = sc.nextInt();
                        double b2 = sc.nextInt();
                        double c2 = sc.nextInt();
                        double sum2 = a2 + b2 + c2;
                        System.out.println("The Ans is : " + sum2);
                        break;
                    case 4:
                        System.out.println("Enter the 4 variables with a space between :");
                        double a3 = sc.nextInt();
                        double b3 = sc.nextInt();
                        double c3 = sc.nextInt();
                        double d3 = sc.nextInt();
                        double sum3 = a3 + b3 + c3 + d3;
                        System.out.println("The Ans is : " + sum3);
                        break;
                    default:
                        System.out.println("Enter Valid Number of Variables Only 2 3 or 4");
                        break;
                }
                break;
            case 2:
                System.out.println("Select the number of variables you want for  Subtraction: \n (Eg: 2 var->a+b, 3var->a+b+c, 4var->a+b+c) \n type: 2 3 4");
                int varNum1 = sc.nextInt();
                switch (varNum1) {
                    case 2:
                        System.out.println("Subtraction:\n Enter the 2 Variables with a space between :");
                        double a1 = sc.nextInt();
                        double b1 = sc.nextInt();
                        double sub1 = a1 - b1;
                        System.out.println("The Ans is : " + sub1);
                        break;
                    case 3:
                        System.out.println("Enter the 3 Variables with a space between :");
                        double a2 = sc.nextInt();
                        double b2 = sc.nextInt();
                        double c2 = sc.nextInt();
                        double sub2 = a2 - b2 - c2;
                        System.out.println("The Ans is : " + sub2);
                        break;
                    case 4:
                        System.out.println("Enter the 4 variables with a space between :");
                        double a3 = sc.nextInt();
                        double b3 = sc.nextInt();
                        double c3 = sc.nextInt();
                        double d3 = sc.nextInt();
                        double sub3 = a3 - b3 - c3 - d3;
                        System.out.println("The Ans is : " + sub3);
                        break;
                    default:
                        System.out.println("Enter Valid Number of Variables Only 2 3 or 4");
                        break;
                }
                break;
            case 3:
                System.out.println("Multiplication: \nSelect the number of variables you want for Multiplication operation: \n (Eg: 2 var->a+b, 3var->a+b+c, 4var->a+b+c) \n type: 2 3 4");
                int varNum2 = sc.nextInt();
                switch (varNum2) {
                    case 2:
                        System.out.println("Enter the 2 Variables with a space between :");
                        double a1 = sc.nextInt();
                        double b1 = sc.nextInt();
                        double m1 = a1 * b1;
                        System.out.println("The Ans is : " + m1);
                        break;
                    case 3:
                        System.out.println("Enter the 3 Variables with a space between :");
                        double a2 = sc.nextInt();
                        double b2 = sc.nextInt();
                        double c2 = sc.nextInt();
                        double m2 = a2 * b2 * c2;
                        System.out.println("The Ans is : " + m2);
                        break;
                    case 4:
                        System.out.println("Enter the 4 variables with a space between :");
                        double a3 = sc.nextInt();
                        double b3 = sc.nextInt();
                        double c3 = sc.nextInt();
                        double d3 = sc.nextInt();
                        double m3 = a3 * b3 * c3 * d3;
                        System.out.println("The Ans is : " + m3);
                        break;
                    default:
                        System.out.println("Enter Valid Number of Variables Only 2 3 or 4");
                        break;
                }
                break;
            case 4:
                System.out.println("Division \n Enter the variables for Division operation: ");
                System.err.println(" Enter Dividend : ");
                double a = sc.nextInt();
                System.err.println(" Enter Divisor : ");
                double b = sc.nextInt();
                System.out.println("The Quotient is " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice! \n Please Select Valid Arithematic Operation!");
                break;
        }
    }
}
