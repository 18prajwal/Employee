import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(null);
        list.add(null);
        list.add(60);
        list.add(20);
        list.add(null);
        list.add(1);

        System.out.println(list);
    }
}
