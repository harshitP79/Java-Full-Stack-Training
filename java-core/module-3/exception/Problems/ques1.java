
public class ques1 {
    /* write a java program to handle nullpointerException?
    
    
    */
   public static void main(String[] args) {
    System.out.println("main start");

    String str = null;

    try {
        // This will throw NullPointerException
        System.out.println("Length of the string: " + str.length());
    } catch (NullPointerException npe) {
        System.out.println("Exception caught: Attempted to access a method on a null object reference." + npe);
    } finally {
        System.out.println("Finally block is always executed.");
    }

    System.out.println("main end");
}
}