public class runTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Main Start!");
        System.out.println("");

        Father f = new Son(); // upcasting
        f.show();

        System.out.println("");
        System.out.println("Main End!");
    }
}
class Father {
    public void show() {
        System.out.println("Show method of Father class");
    }
}


/*
 code for runtime polymorphism in java
 runtime polymorphism:
    method overriding in java
 */