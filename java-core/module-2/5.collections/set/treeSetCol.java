import java.util.Set;
import java.util.TreeSet;

public class treeSetCol {
    public static void main(String[]    args) {
        Set<String> ts = new TreeSet<String>() ;
        ts.add("Kabir"); 
        ts.add("Nitish");
        ts.add("Aman");
        ts.add("Ravi");
        ts.add("Sonal");
        ts.add("Zoya");
        ts.add("Balaji");
        System.out.println("TreeSet elements: " + ts);
        TreeSet<String> dts = (TreeSet) ts;
        System.out.println("DESC: "+ dts.descendingSet());
    }
}
