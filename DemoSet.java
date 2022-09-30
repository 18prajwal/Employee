import java.util.HashSet;

public class DemoSet {
    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(null);
        set.add(null);
        set.add(10);
        set.add(60);
        set.add(20);
        set.add(null);
        set.add(1);
        set.add(30);

        System.out.println(set);

    }
}
