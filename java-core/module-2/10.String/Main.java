public class Main {
    /*
    String class in Java:
    String is a class in Java that represents a sequence of characters.
    It is widely used for handling text data in Java applications.
    String objects are immutable, meaning that once a String object is created, its value cannot be changed.

    String literals are created using double quotes, and they are stored in a special area of memory called the string pool.
     When a string literal is created, Java checks if an identical string already exists in the pool. If it does, it reuses the existing string object instead of creating a new one. This is known as string interning.

     String class provides various methods for manipulating strings, such as length(), charAt(), substring(), toUpperCase(), toLowerCase(), trim(), equals(), and many more.

     String concatenation can be done using the + operator or the concat() method.

     StringBuilder and StringBuffer classes are used for mutable strings when you need to modify the string content frequently.

     Overall, the String class is an essential part of Java programming and is used extensively for handling text data in various applications.
    */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Comparing string literals
        System.out.println(str1 == str2); // true, because they refer to the same string literal in the pool
        System.out.println(str1.equals(str2)); // true, because their content is the same

        // Comparing string objects created with new
        System.out.println(str1 == str3); // false, because they are different objects in memory
        System.out.println(str1.equals(str3)); // true, because their content is the same

        // Using String methods
        System.out.println(str1.length()); // 5
        System.out.println(str1.charAt(0)); // 'H'
        System.out.println(str1.substring(0, 3)); // "Hel"
        System.out.println(str1.toUpperCase()); // "HELLO"

        //more Operations
        String str4 = " World";
        String str5 = str1 + str4; // Concatenation using + operator
        String str6 = str1.concat(str4); // Concatenation using concat() method
        System.out.println(str5); // "Hello World"
        System.out.println(str6); // "Hello World"

        //splitting a string
        String str7 = "Java,Python,C++";
        String[] languages = str7.split(",");
        for (String language : languages) {
            System.out.println(language);
        }

        //Uppercase and lowercase
        String str8 = "Java Programming";
        System.out.println(str8.toUpperCase()); // "JAVA PROGRAMMING"
        System.out.println(str8.toLowerCase()); // "java programming"
        
        //trim
        String str9 = "   Hello World   ";
        System.out.println(str9.trim()); // "Hello World"

        //replace
        String str10 = "Hello World";
        System.out.println(str10.replace("World", "Java")); // "Hello Java"
        System.err.println(str10);// "Hello World" because strings are immutable, so the original string remains unchanged.

        //StringBuilder
        //StringBuilder is a mutable sequence of characters. It is used when you need to modify the string content frequently.
        //Operations like append, insert, delete, reverse, etc. can be performed on StringBuilder without creating new objects.
        //tostring() method is used to convert StringBuilder to String.
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // "Hello World" 

        //insert
        sb.insert(5, ",");
        System.out.println(sb.toString()); // "Hello, World"

        //delete
        sb.delete(5, 11);
        System.out.println(sb.toString()); // "Hello"

        //reverse
        sb.reverse();
        System.out.println(sb.toString()); // "olleH"
        
    }
}
