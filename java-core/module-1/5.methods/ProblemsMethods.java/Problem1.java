

public class Problem1 {

    static int add(int a, int b){
        return a+b;
    }    
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int multiply(int a, int b, int c){
        return a*b*c;
    }  
    static int subtract(int a, int b, int c, int d){
        return a-b-c-d;
    }
    public static void main(String[] args) {
        /* WAJP to create Calculator class consist of 4 methods.
        1. To add 3 variables 
        2. To multiply 3 varibles
        3. To subtract 4 variables 
        4. to add 2 variables
        */
       int a = 12;
       int b = 39;
       int c = 42;
       int d = 72;
       System.out.println(add(a, b));
       System.out.println(add(a, b,c));
       System.out.println(multiply(a, b, c));
       System.out.println(subtract(a, b, c, d));

    }
}
