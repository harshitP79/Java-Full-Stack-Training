public class Interface1{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Initial Dimensions: " + rect.toPrint());
        
        rect.resizeWidth(30);
        rect.resizeHeight(40);
        
        System.out.println("Resized Dimensions: " + rect.toPrint());
    }
}
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }
    
    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }
    
    public String toPrint() {
        return "Width: " + width + ", Height: " + height;
    }
}


/*
    Q.  Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.


### Explanation:

1. **Resizable Interface:**
   - The `Resizable` interface is defined with two methods: `resizeWidth(int width)` and `resizeHeight(int height)`.

2. **Rectangle Class:**
   - The `Rectangle` class implements the `Resizable` interface.
   - It has private fields `width` and `height` to store the dimensions of the rectangle.
   - The class constructor initializes these fields.
   - Getter methods `getWidth()` and `getHeight()` are provided to access the dimensions.
   - The `resizeWidth` and `resizeHeight` methods are overridden to update the dimensions of the rectangle and print the new dimensions.
   - The `toPrint` method is to return a string representation of the rectangle's dimensions.

3. **Main Class:**
   - In the `main` method, a `Rectangle` object is created with initial dimensions.
   - The initial dimensions are printed.
   - The `resizeWidth` and `resizeHeight` methods are called to change the dimensions.
   - The updated dimensions are printed.
*/
/*
    What the problem wants:
    
    code expalination full detail:
1. **Resizable Interface:**
    - The `Resizable` interface is defined with two methods: `resizeWidth(int width)` and `resizeHeight(int height)`. These methods are intended to be implemented by any class that wants to provide functionality for resizing its width and height.
2. **Rectangle Class:**
    - The `Rectangle` class implements the `Resizable` interface, meaning it must provide concrete implementations for the methods defined in the interface.
    - It has two private fields, `width` and `height`, which store the dimensions of the rectangle.
    - The constructor `Rectangle(int width, int height)` initializes these fields when a new object of the class is created.
    - Getter methods `getWidth()` and `getHeight()` are provided to allow access to the current dimensions of the rectangle.
    - The `resizeWidth(int width)` method updates the `width` field with the new value and prints a message indicating the new width.
    - The `resizeHeight(int height)` method updates the `height` field with the new value and prints a message indicating the new height.
    - The `toPrint()` method returns a string representation of the rectangle's current dimensions, which can be used for display purposes.
3. **Main Class:**
    - In the `main` method, a `Rectangle` object is created with initial dimensions of 10 (width) and 20 (height).
    - The initial dimensions are printed using the `toPrint()` method.
    - The `resizeWidth(30)` method is called to change the width of the rectangle to 30, and a message is printed to indicate the change.
    - The `resizeHeight(40)` method is called to change the height of the rectangle to 40, and a message is printed to indicate the change.
    - Finally, the updated dimensions are printed again using the `toPrint()` method.

*/