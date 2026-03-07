
import java.util.Scanner;

class IfDMS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        // int a = sc.nextInt();

        // if(a%2==0){
        // System.out.println("The given Number is Even Number");
        // }
        // if(a%2!=0){
        // System.out.println("The given Number is Odd Number");
        // }
        //WJP for if number is divisible by 7 or not?
        // if(a%7==0){
        // 	System.out.println("The Number is Divisible by 7");
        // }else{
        // 	System.out.println("The number is not divisble by 7");
        // }
        //WJP for if number is divisible by 3 and 5 or not 
        // if(a%3==0 && a%5==0){
        // 	System.out.println("The Number is divisble By 3 and 5");
        // }else{
        // 	System.out.println("The Numbe is not divisible by 3 and 5");
        // }
        //WJP if the character is vowel or consnent
        // if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' ||c=='U' ){
        // 	System.out.println("The Character is vowel!");
        // }else{
        // 	System.out.println("The character is a consonent!");
        // }
        //WJP if the given character is digit or not
        // if(c>='0' && c<='9'){
        // 	System.out.print("The char is a digit");
        // }else{
        // 	System.out.print("The char is not a digit");
        // }
        //WJP to check wheather the given character is upper case char, lower case char , digit, or special character
        //ELSE IF
        // int c = sc.next().charAt(0);
        // if(c >= 'A' && c<='Z'){
        // 	System.out.println("UpperCase char");
        // }else if(c >='a' && c<='z'){
        // 	System.out.println("LowerCase char");
        // }else if(c>='0' && c<='9'){
        // 	System.out.println("Digit");
        // }else{
        // 	System.out.println("Special Char");
        // }
        //WJP to calculate and display the grade of a student based on the marks obtained.
        // int marks = sc.nextInt();
        // if (marks > 100) {
        //     System.out.println("Marks Exceeded The limit 100!");
        // } else if (marks >= 90) {
        //     System.out.println("Grade A");
        // } else if (marks >= 75 && marks < 90) {
        //     System.out.println("Grade B");
        // } else if (marks >= 60 && marks < 75) {
        //     System.out.println("Grade C");
        // } else if (marks >= 40 && marks < 60) {
        //     System.out.println("Grade D");
        // } else if (marks < 40) { 
        //     System.out.println("Fail!");
        // } else {
        //     System.out.println("Invalid marks!");
        // }
        //WJP to check the given character is uppercase vowel or uppercase consonant, LOWERCASE vowel or lowercase Consonant.
        // int c = sc.next().charAt(0);
        // if (c >= 'A' && c <= 'Z') {
        //     if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        //         System.out.println("UPPERCASE VOWEL");
        //     } else {
        //         System.out.println("UPPERCASE CONSONANT");
        //     }
        // } else if (c >= 'a' && c <= 'z') {
        //     if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        //         System.out.println("LOWERCASE VOWEL");
        //     } else {
        //         System.out.println("LOWERCASE CONSONANT");
        //     }
        // } else if (c >= '0' && c <= '9') {
        //     System.out.println("Enter an alphabet");
        // }

		//WJP to check the given number is negative number, positive number or zero.

		// int n = sc.nextInt();
		// if(n>=1){
		// 	System.out.println("The number is postive Integer.");
		// }else if(n<=-1){
		// 	System.out.println("The number is a negative Integer!");
		// }else{
		// 	System.out.println("The number is ZERO!");
		// }
		//WJP to find max number from three numbers.
		int a, b ,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a>b && a>c){
			System.out.println("A is MAX.");
		}else if(b>a && b > c){
			System.out.println("B is MAX.");
		}else{
			System.out.println("C is MAX.");
		}
		//WJP to find min number from the three numbers.
		
		// if(a<b && a<c){
		// 	System.out.println("A is MIN.");
		// }else if(b<a && b < c){
		// 	System.out.println("B is MIN.");
		// }else{
		// 	System.out.println("C is MIN.");
		// }
    }
}
