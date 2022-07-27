public class RotateListbyKUnits {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
        //Given a singly linked list of size N. The task is to left-shift the linked list
        // by k nodes, where k is a given positive integer smaller than or equal to length
        // of the linked list.
    }
    public Node rotate(Node head, int k) {

        Node newHead=null;
        Node newTail=null;
        if(head==null)
        {
            return head;
        }
        Node current=head;
        Node pre=null;
        int count=0;
        while(current.next!=null)
        {
            pre=current;
            current=current.next;
            count++;

            if(count==k)
            {
                newHead=current;
                newTail=pre;
            }

        }
        if(count+1==k)
        {
            return head;
        }
        current.next=head;
        newTail.next=null;
        head=newHead;
        return head;


    }
}
