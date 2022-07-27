public class PairwisSwapLL {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1
        //Given a singly linked list of size N. The task is to swap elements in the linked list pairwise.
        //For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.
    }
    public Node pairwiseSwap(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;

        }
        Node newHead=head.next;
        Node current=head;
        Node pre=new Node(5);
        while(current!=null)
        {
            pre.next=reverse(current);
            pre=current;
            current=current.next;
        }
        return newHead;


    }
    public Node reverse(Node head)
    {
        if(head.next==null)
        {
            return head;
        }
        Node pre=head;
        Node current=head.next;
        Node forward=current.next;
        current.next=pre;
        pre.next=forward;
        return current;
    }

    public Node pairwiseSwap(Node head)
    {//DONE WITH RECURSION
        if(head== null || head.next==null)
        {
            return head;
        }
        Node forward=head.next;
        Node pre=head;
        Node forNext=head.next.next;
        forward.next=pre;

        pre.next=pairwiseSwap(forNext);

        return forward;
    }
}
