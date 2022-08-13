import java.util.ArrayList;
import java.util.*;

public class sample {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,4);
        map.put(2,6);
        map.put(3,8);
        map.put(4,10);

        Collection<Integer> array=new ArrayList<>(map.keySet());
        array.add(5);
        System.out.println(array);





    }
}
