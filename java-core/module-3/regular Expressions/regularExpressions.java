
public class regularExpressions {

    /*
    Regular Expressions in Java
    Regular expressions (regex or regexp) are patterns used to match character combinations in strings. In Java, the java.util.regex package provides classes for working with regular expressions.
    Key Classes:
    Pattern: This class is used to define a pattern (regular expression).
    Matcher: This class is used to perform match operations on a character sequence by interpreting a Pattern.
    Common Methods:
    Pattern.compile(String regex): Compiles the given regular expression into a pattern.
    Matcher matcher(CharSequence input): Creates a matcher that will match the given input against this pattern.
    boolean matches(): Attempts to match the entire region against the pattern.
    boolean find(): Attempts to find the next subsequence of the input sequence that matches the pattern.
    Example:
    1. Validating an Email Address
    2. Finding All Occurrences of a Word in a Text
    3. Replacing Substrings
    Some important patterns : 
.	=	Matches any single character except a newline.
+	=	Matches one or more occurrences of the previous character or pattern.
*	=	Matches zero or more occurrences of the previous character or pattern.
? 	=  zero or one occurrence of the preceding character / group
\d	=	Matches any single digit from 0 to 9.
\w 	=	matches letters, digits, and underscore only — no spaces or special characters.
\s 	=   matches any whitespace character such as space, tab, or newline.
[A-Z]	=	Matches any one uppercase letter from A to Z.
[a-z]	=	Matches any one lowercase letter from a to z.
abc  =	Matches the exact sequence of characters abc in a string.
{n}	=	 exactly n occurrences of the preceding character or group
{n,m} =		is used when the number of repetitions must fall within a specific range.
 | (OR)	= 	allows matching one pattern OR another, and grouping with ( ) is highly recommended.

 Hello World -> true
Java 8 -> true
User1 Name -> true
Suraj Kumar -> true
A B -> true
Test Case -> true
Hello -> false
Java8 -> false
123 -> false
HelloWorld -> false
 Hello World -> false
Hello  World -> false
     */
    public static void main(String[] args) {

        // + * ? . \d \w \s


        // String regex = "";

        // String[] inputs={
        //     "Hello World",
        //     "Java 8",
        //     "User1 Name",
        //     "Suraj Kumar",
        //     "A B",
        //     "Test Case",
        //     "Hello",
        //     "Java8",
        //     "123",
        //     "HelloWorld",
        //     " Hello World",
        // };

        // for(String input:inputs){
        //     boolean isMatch = input.matches("^[A-Za-z]+\\s[A-Za-z]+$");
        //     System.out.println(input + " -> " + isMatch);
        // } 

        // A to Z , a to z , space in between
    
        //Program to understand [A_Z], [a-z]
        String pattern = "^[A-Z][a-z]+\\s[a-z]+$";        

        // System.out.println("A".matches("[A-Z]")); //true
        // System.out.println("Z".matches("[A-Z]"));  
        // System.out.println("M".matches("[A-Z]")); 
        // System.out.println("a".matches("[A-Z]")); 
        // System.out.println("AA".matches("[A-Z]")); 
        // System.out.println("1".matches("[A-Z]")); 
        // System.out.println("@".matches("[A-Z]")); 
        // System.out.println();
        // System.out.println("a".matches("[a-z]"));
        // System.out.println("z".matches("[a-z]"));
        // System.out.println("m".matches("[a-z]"));
        // System.out.println("A".matches("[a-z]"));
        // System.out.println("aa".matches("[a-z]"));
        // System.out.println("1".matches("[a-z]"));
        // System.out.println("@".matches("[a-z]"));
        // System.out.println();

        // System.out.println("abc".matches("abc"));//true
        // System.out.println("ab".matches("abc"));//false
        // System.out.println("abcd".matches("abc"));//false
        // System.out.println("aBc".matches("abc"));//false
        // System.out.println("ABC".matches("abc"));//false
        // System.out.println("abc".matches("abc"));//true

        //{n} {n,m} and |
        System.out.println("aaa".matches("a{3}"));//true
        System.out.println("aa".matches("a{3}"));//false
        System.out.println("aaaa".matches("a{3}"));//false

        System.out.println("aaaa".matches("a{3,5}"));//true
        System.out.println("aa".matches("a{3,5}"));//false
        System.out.println("aaaaaa".matches("a{3,5}"));//false

        System.out.println("cat".matches("cat|dog"));//true
        System.out.println("dog".matches("cat|dog"));//true
        System.out.println("bat".matches("cat|dog"));//false

        //anchoring ^ and $ ^ means start of the string , $ means end of the string
        System.out.println("abc".matches("^abc"));
        System.out.println("xabc".matches("^abc"));
        System.out.println("abcx".matches("^abc"));

        System.out.println("abc".matches("abc$"));
        System.out.println("xabc".matches("abc$"));
        System.out.println("abcx".matches("abc$"));
        



    }
}
