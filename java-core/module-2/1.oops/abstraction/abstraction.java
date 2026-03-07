public class abstraction {
    /* Abstraction means showig only essential things to the user and hiding the internal details.
    in simple words, abstraction is the process of hiding the implementation details and showing only functionality to the user.
    How to achieve abstraction in java?
    1. Abstract class
    2. Interface

    concrete method : method with body and implementation is known as concrete method.
    concrete class : class with complete implementation is known as concrete class. 
    Abstract method : method without body and implementation is known as abstract method.
    Abstract class : class with abstract method is known as abstract class.
    1. Abstract class:
        A class with abstract keyword is known as abstract class.
        It can have abstract method and concrete method.
        It cannot be instantiated.
        It can have constructor.
        It can have static method and static variable.
        It is used to achieve 0 to 100% abstraction.
        It is used when we have some common functionality and some specific functionality.
        It is used when we want to provide a template to the sub classes.
        Note: we cannot create object of abstract class.

    How to create abstract method?
    Must be prefixed with abstract keyword.
    Must end with semicolon.
    Does not have method body.
    
    In abstract class we can create abstract method and no static concrete method hence we cannot achieve 100% abstraction using abstract class.
    If you want to achieve 100% abstraction then we have to use interface.
    
    */
    public static void main(String[] args) {
        System.out.println("Main Start!");
        System.out.println("");

        // Father f = new Father(); // we cannot create object of abstract class

        Father f = new Son(); // upcasting
        f.test();
        int sum = f.add(10,20);
        System.out.println("Sum: " + sum);
        // f.demo(); // we cannot access the method of sub class using super class reference variable
    
        System.out.println("");
        System.out.println("Main End!");
    }
}

abstract  class Father{
    abstract  public  void test();
    abstract  public  int add(int a , int b);

}

class Son extends Father{

    @Override
    public void test() {
        System.out.println("Test method Override");
        
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public void demo(){
        System.out.println("Demo method of Son class");
    }

}