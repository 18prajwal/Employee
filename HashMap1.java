import java.util.*;


class HashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(2,"two");
        map.put(3,"three");
        map.put(7,"seven");
        map.put(1,"one");
        map.put(9,"nine");
        map.put(5,"five");
        map.put(4,"four");
        map.put(6,"six");
        map.put(2,"two");
        System.out.println(map);


        for(Map.Entry<Integer,String> entry:map.entrySet()){
            String value= entry.getValue();
            if(value.equals("seven")){
                int key=entry.getKey();
                System.out.println(key);
            }
        }
    }
}
