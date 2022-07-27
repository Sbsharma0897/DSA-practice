import java.util.*;

public class RemoveDuplicatesfromUnsorted {
    public static void main(String[] args) {
    //https://www.youtube.com/watch?v=dAZJgVFHpqA&list=PLPyD8bF-abzuor0yYzO1g7v8y7u6vO-Fe&index=10
  //Given an unsorted linked list of N nodes. The task is to remove duplicate elements
        // from this unsorted Linked List. When a value appears in multiple nodes, the node
        // which appeared first should be kept, all others duplicates are to be removed.
    }

    public Node removeDuplicatesBETTER(Node head)
    {
        //This is better method
        HashSet<Integer> set=new HashSet<>();

        Node current=head;
        Node pre=null;
        while(current!=null)
        {
            if(set.contains(current.data))
            {
                pre.next=current.next;
                current=pre.next;
            }
            else
            {
                pre=current;
                current=current.next;
                set.add(pre.data);
            }
        }
        return head;
    }
    public Node removeDuplicates(Node head)
    {
   ///This is a bit long
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        Node current=head;
        while(current!=null)
        {
            set.add(current.data);
            current=current.next;
        }
        ArrayList<Integer> array=new ArrayList<>(set);

        current=head;
        Node pre=null;
        for(int el:array)
        {
            current.data=el;
            pre=current;
            current=current.next;

        }
        pre.next=null;

        return head;

    }
}
