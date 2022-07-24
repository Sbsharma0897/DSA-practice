import java.util.*;

public class Demo {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(4,5);

      HashSet<Integer> set=new HashSet<>(map.values());
        System.out.println(set);


    }
}
