import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoTreeSet {

    public static void main(String args[]){
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("abc");
        treeSet.add("def");
        treeSet.add("ghi");
        treeSet.add("xyz");
        treeSet.add("poco");
        treeSet.add("ijk");
        treeSet.add("mnop");
	treeSet.add("abc");

        System.out.println(treeSet);
    }

}
