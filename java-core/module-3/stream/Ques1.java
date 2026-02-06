import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {
    int id;
    String name;
    double marks;

    public Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(Students s) {
        return this.id - s.id;
    }
}

public class Ques1 {
    public static void main(String[] args) {

        List<Students> st = new ArrayList<>();
        st.add(new Students(3, "Murali", 75.5));
        st.add(new Students(4, "Aditya", 85.5));
        st.add(new Students(1, "Vishnu", 80.5));
        st.add(new Students(2, "Pramod", 90.5));
        st.add(new Students(2, "Suraj", 55.5));

        System.out.println("Original List:");
        st.forEach(System.out::println);

        System.out.println("\n1) Sorted by id (Ascending):");
        st.stream().sorted(Comparator.comparingInt(s -> s.id)).forEach(System.out::println);

        System.out.println("\n2) Sorted by id (Descending):");
        st.stream().sorted((s1, s2) -> Integer.compare(s2.id, s1.id)).forEach(System.out::println);

        System.out.println("\n3) Sorted by name:");
        st.stream().sorted(Comparator.comparing(s -> s.name)).forEach(System.out::println);

        System.out.println("\n4) Sorted by marks:");
        st.stream().sorted(Comparator.comparingDouble(s -> s.marks)).forEach(System.out::println);

        System.out.println("\n5) Add 5 grace marks and print updated marks:");
        st.forEach(s -> {
            s.marks += 5;
            System.out.println(s.name + " -> " + s.marks);
        });
    }
}
