import java.util.*;

class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(2,"two");
        map.put(3,"three");
        map.put(7,"seven");
        map.put(1,"one");
        map.put(9,"nine");
       map.put(null,"null");
        map.put(4,"four");
        map.put(6,"six");
        map.put(2,"two");
        System.out.println(map);
    }
}
