import java.util.ArrayList;
import java.util.LinkedList;

public class LLCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.addFirst(2);
        list.addFirst(4);
        list.addLast(5);
        list.addLast(6);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i)+"-->");
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list );
    }
}
