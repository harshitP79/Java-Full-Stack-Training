
public class StaticJava {
   
    // Instance variables
    int id;
    String name;
    int[] marks; // size 3

    // Parameterized constructor
    StaticJava(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;

        // Deep copy of marks array
        this.marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    // Copy constructor (deep copy)
    StaticJava(StaticJava s) {
        this.id = s.id;
        this.name = s.name;

        this.marks = new int[3];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    // Method to display student details
    void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        int[] marks1 = {85, 90, 88};

        // Create object using parameterized constructor
        StaticJava s1 = new StaticJava(1, "Harshit", marks1);

        // Create object using copy constructor
        StaticJava s2 = new StaticJava(s1);

        // Modify marks of copied object
        s2.marks[0] = 100;

        // Print both objects
        System.out.println("Original Student:");
        s1.display();

        System.out.println("Copied Student:");
        s2.display();
    }


}
/* Instance ontizalizer block and non static method before the execution of main method! */
/*
    WAJP to create student class consist of 4 data such as:
	id, name , percentage, college name
    create parameterized constructor to initialize only id.
    -create parameterized constructor to initialize only name.
    -create parameterized constructor to initialize only percentage.
    -create parameterized constructor to initialize id and name.
    -create parameterized constructor to initialize id and percentage.
    -create parameterized constructor to initialize name and percentage.
    -create parameterized constructor to initialize id , name and percentage.
    -create default / no argument constructor to assign default values.
    -create one static method called printDetail to print all the details of 
    student.
    -in main method create objects using all constructors.
    -call static method using class name.
*/
