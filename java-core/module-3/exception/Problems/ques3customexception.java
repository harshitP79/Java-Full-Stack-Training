package Problems;

public class ques3customexception {
    /* 
    Custom Exception Class:
    Create a custom exception class named InvalidAgeException that extends the Exception class.
    This exception should be thrown when a user tries to set an invalid age (e.g., negative age or age greater than 150).
    
    */
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            setAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            setAge(30);
            System.out.println("Age set successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    static void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
        }
        // Age is valid, proceed with setting the age
    }
    
   
}
