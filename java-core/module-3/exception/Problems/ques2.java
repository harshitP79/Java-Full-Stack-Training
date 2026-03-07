public class ques2 {
    /* WAJP to Handle classCastException
     */
    public static void main(String[] args) {
        System.out.println("main start");

        Object obj = Integer.valueOf(10); // obj is actually an Integer

        try {
            // This will throw ClassCastException
            String str = (String) obj;
            System.out.println("String value: " + str);
        } catch (ClassCastException cce) {
            System.out.println("Exception caught: Invalid type casting attempted." + cce);
        } finally {
            System.out.println("Finally block is always executed.");
        }

        System.out.println("main end");
    }
}
