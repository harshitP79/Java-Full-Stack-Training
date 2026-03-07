public class polymorphism {
        /* An ability of an object to exhibit more than one form is known as polymorphism.
        one name but diffrent behaviours.

        Types of polymorphism :
        1. Complile time polymorphism
        The binding happens during compile time is known as complie time polymorphism.
        it is known as static binding.
        We can achieve complie time polymorphism using
            1.method overloading
            2.consturctor overloading
            3.variable shadowing
                A sub class and super class is static variable or no static variable with same is known as variable shadowing.
                Which variable to be called is decided 
            4.method shadowing
                A sub class and super class is static method with same name, same access modifier, same return type and same parameter is known as method shadowing.
                Which method to be called is decided during compile time based on the reference variable type.
        2. Runtime Polymorphism
        The binding happens during runtime is known as runtime polymorphism.
        It is also know as dynamic binding.
        We can achieve runtime polymorphism using  MethodOveriding.
            A sub class and super class is method with same name, same access modifier, same return type and same parameter is known as method overriding.
            which method to be called is decided during runtime based on the object type.
        Annotation: extra validation provided by programmer to the compiler.
        @override : used to override the method of super class in sub class.
            if we are not giving @override and if there is any mistake in overriding the method then compiler will not give any error.
        Why we use variable shadwoing
        //to access the variable of superclass
        Where we use varable shadowing
        // we use variable shadowing in inheritance , upcasting , downcasting, etc.
        */

    public static void main(String[] args) {
        System.out.println("Main Start!");
        System.out.println("");
        System.out.println("Main End!");

    }
}

class Father{
    int a = 10;
    static int b = 100;

}
class Son extends Father{
    int a = 20;
    static int b = 200;
}