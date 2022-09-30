import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String args[]){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(10);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(20);
        linkedHashSet.add(60);
        linkedHashSet.add(290);
        linkedHashSet.add(null);
        linkedHashSet.add(1);
        linkedHashSet.add(30);

        System.out.println(linkedHashSet);
    }
}
