import java.util.Scanner;

class ValidDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Valid Day: ");
        String Day = sc.next();//Next for one word and Next line for sentence
        if (Day.equals("monday") || Day.equals("tuesday") || Day.equals("wednesday") || Day.equals("thursday") || Day.equals("friday") || Day.equals("saturday") || Day.equals("sunday")) {
            if (Day.equals("saturday") || Day.equals("sunday")) {
                System.out.println(Day + " is a Weekend");
            } else {
                System.out.println(Day + " is a Weekday");
            }
        } else {
            System.out.println("Invalid Day");
        }
    }
}
