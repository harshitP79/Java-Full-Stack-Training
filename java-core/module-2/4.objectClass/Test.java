
public class Test {

    int id;
    String name;
    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // @Override
    // public String toString() {
    //     return "Test{id=" + id + ", name='" + name + "'}";
    // }
    public boolean equals(Object obj) { 
        Test other = (Test) obj;
        return this.id == other.id && this.name == other.name;
    }
    public static void main(String[] args) {
        Test obj = new Test(1, "Example");
        System.out.println(obj);
        System.out.println(obj.toString());

        Test obj2 = new Test(1, "Example");
        System.out.println(obj.equals(obj2));
        
    }
}
//Output without overriding toString():
//Test@15db9742
//Test@15db9742
//Output with overriding toString():
//Test{id=1, name='Example'}
//Test{id=1, name='Example'}
/*
    toString() returns a string representation of the object.
    By default, it returns the class name followed by the object's hash code.
    Overriding toString() allows for a more meaningful representation of the object.
    why do we need to override toString()?
    To print data of an object rather than its memory address.

    Hashcode method:
    hashCode() returns an integer hash code value for the object.
    It is used in hashing-based collections like HashMap, HashSet, etc.
    it will return uniquwe integer value for different objects.

    Equals method:
    equals() method compares two objects for equality.
    The return type is boolean.
    It is used to compare addresses of two objects by default.
    Why do we need to override equals()?
    To compare the actual data of two objects rather than their memory addresses.
*/ 