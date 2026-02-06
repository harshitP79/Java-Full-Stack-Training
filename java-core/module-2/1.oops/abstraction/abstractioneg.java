/*
1. Create a base class Person with method:
	showRole() → prints "I am a person"

2. Create two child classes:
	Student extends Person
	Teacher extends Person

3. Create two interfaces:
	Sports → method play()
	Cultural → method perform()

4. Create a class CollegeStudent that:
	Extends Student
	Implements both Sports and Cultural

5. In main():
	Create object of CollegeStudent
	Call all methods

    // CODE Line By line Explanation:
    // 1. We define a base class Person with a method showRole() that prints "I am a person".
    // 2. We create two child classes, Student and Teacher, that extend the Person class and override the showRole() method to print their respective roles.
    // 3. We define two interfaces, Sports and Cultural, each with a method: play() and perform() respectively.
    // 4. We create a class CollegeStudent that extends the Student class and implements both the Sports and Cultural interfaces, providing implementations for the play() and perform() methods.
    // 5. In the main() method, we create an object of CollegeStudent and call all the methods to demonstrate inheritance and interface implementation.
    
*/

class Person {
    void showRole() {
        System.out.println("I am a person");
    }
}
class Student extends Person {
    @Override
    void showRole() {
        System.out.println("I am a student");
    }
}
class Teacher extends Person {
    @Override
    void showRole() {
        System.out.println("I am a teacher");
    }
}
interface Sports {
    void play();
}

interface Cultural {
    void perform();
}
class CollegeStudent extends Student implements Sports, Cultural {
    @Override
    public void play() {
        System.out.println("Playing sports");
    }

    @Override
    public void perform() {
        System.out.println("Performing cultural activities");
    }
}
public class abstractioneg {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.showRole(); // From Student class
        cs.play();     // From Sports interface
        cs.perform();  // From Cultural interface
    }
}
