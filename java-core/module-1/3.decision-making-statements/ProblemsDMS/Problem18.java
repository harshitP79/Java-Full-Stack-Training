//WJP to calculate the area of recangle, square, circle, triangle using switch case.
import java.util.Scanner;

 class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the shape to calculate area: \n1. Rectangle \n2. Square \n3. Circle \n4. Triangle");
        int shapeChoice = sc.nextInt();
        double area = 0;

        switch (shapeChoice) {
            case 1:
                System.out.println("Enter length and breadth of the rectangle:");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area of Rectangle: " + area);
                break;
            case 2:
                System.out.println("Enter side of the square:");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square: " + area);
                break;
            case 3:
                System.out.println("Enter radius of the circle:");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of Circle: " + area);
                break;
            case 4:
                System.out.println("Enter base and height of the triangle:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle: " + area);
                break;
            default:
                System.out.println("Invalid shape choice");
        }
    }
}
