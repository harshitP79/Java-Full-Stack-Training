
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ques {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(13);
        al.add(12);
        al.add(14);
        al.add(14);
        al.add(null);
        al.add(15);
        al.add(11);
        al.add(10);
        al.add(16);
        al.add(null);
        al.add(10);
        System.out.println("Al: " + al);
        //WAJP to remove duplicate elements from the above list, and print the list without only unique elements.
        //Output : al = [10, 12, 13, 14, null, 15, 11, 16]
        Set<Integer> set = new LinkedHashSet<Integer>(al);
        
        
        List<Integer> al2 = new ArrayList<Integer>(set);
        System.out.println("Al without duplicates: " + al2);

    }
}
