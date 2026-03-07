public class compileTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Main Start!");
        System.out.println("");

        MathOperation mo = new MathOperation();
        int sum1 = mo.add(10, 20);
        System.out.println("Sum of two integers: " + sum1);

        double sum2 = mo.add(10.5, 20.5);
        System.out.println("Sum of two doubles: " + sum2);

        double sum3 = mo.add(10, 20, 30);
        System.out.println("Sum of three integers: " + sum3);

        System.out.println("");
        System.out.println("Main End!");
    }
}

class MathOperation {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public double  add(int a, int b, int c) {
        return a + b + c;
    }

}

    // Method to add three integers
/*
    compile time polymorphism in java
*/