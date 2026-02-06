
import java.util.Scanner;

public class ExceptionHandeling {

    /*
    Exception handling in Java is a mechanism that allows developers to manage runtime errors, ensuring the normal flow of the application. It involves using specific keywords and constructs to catch and handle exceptions gracefully.

    Throwable Hierarchy:
    - The `Throwable` class is the superclass of all errors and exceptions in Java.
    - It has two main subclasses: `Error` (serious problems that applications should not try to catch) and `Exception` (conditions that applications might want to catch).
    #CHECKED AND UNCHECKED EXCEPTIONS : Checked exceptions are checked at compile-time, while unchecked exceptions are not checked at compile-time.
                                        UNCHECKED EXCEPTIONS                     
    --Error: Represents serious issues like `OutOfMemoryError` or `StackOverflowError`.
    --Exception: Represents conditions that applications might want to catch, such as `IOException` or `SQLException`.
        RuntimeException: A subclass of Exception that represents exceptions that can occur during the normal operation of the Java Virtual Machine (JVM):
        - IndexOutOfBoundsException(ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, etc.) 
        - NullPointerException  
        - ArithmeticException
        -InputMismatchException
        -classCastException

        SQLException                ----) 
        IOException                 ----)
        FileNotFoundException       ----)
        CloneNotSupportedException  ----} Checked Exceptions
        InterruptedException        ----)
        ClassNotFoundException      ----)
    
    What willl happen if exception occurs?
    -1. The flow of the program is disrupted.
    -2. Exception object is created which contain : a. Name of the exception b. Description of the exception c. State of the program when exception occurred.
    -3. JVM searchesfor  exception handler and if it is found, exception is handled and program continue after try catch block and if it is not found, program terminates abnormally.


    TRY:
    What it does: The code that might throw an exception is placed inside a try block.
    Why it's useful: It allows you to define a block of code to be tested for errors while it is being executed.

    CATCH:
    What it does: The catch block is used to handle the exception that occurs in the try block.
    Why it's useful: It allows you to define how to respond to specific exceptions, enabling graceful error handling.

    FINALLY:
    What it does: The finally block is used to execute important code such as closing resources, regardless of whether an exception occurred or not.
    Why it's useful: It ensures that critical cleanup code is always executed, preventing resource leaks.

    THROW:
    What it does: It tells java that a method can throw an exception, and it should be handled by the caller of the method.
    Why it's useful: It allows you to propagate exceptions up the call stack, enabling higher-level methods to handle them appropriately.
    
     */

    public static void main(String[] args) {
        System.out.println("main start");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for a: ");
            int a = scanner.nextInt();
            System.out.print("Enter value for b: ");
            int b = scanner.nextInt();

            int ans = a / b;
            System.out.println("Ans: " + ans);}
        // } catch (ArithmeticException ae) {
        //     System.out.println("Exception caught: Division by zero is not allowed." + ae);
        // } catch(InputMismatchException ime){
        //     System.out.println("Exception caught: Invalid input type. Please enter integers only." + ime);
        // }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        }finally {
            System.out.println("Finally block is always executed.");
        }
        System.out.println("main end");
    }
}
