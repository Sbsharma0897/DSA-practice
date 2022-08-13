import java.util.LinkedList;
import java.util.Queue;

public class CollectionFramework {
    public static void main(String[] args) {
        // Here Queue is an interface so to create object of queue we need to make object of its subclasses
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}

