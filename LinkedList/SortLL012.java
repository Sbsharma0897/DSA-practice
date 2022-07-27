public class SortLL012 {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
      //Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only.
        // The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate
        // to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.
    }
    static Node segregate(Node head)
    {
        Node headZero=new Node(10);
        Node tailZero=headZero;
        Node headOne=new Node(10);
        Node tailOne=headOne;
        Node headTwo=new Node(10);
        Node tailTwo=headTwo;

        Node current=head;
        while(current!=null)
        {
            if(current.data==0)
            {
                tailZero.next=current;
                tailZero=tailZero.next;
                current=current.next;

            }
            else  if(current.data==1)
            {
                tailOne.next=current;
                tailOne=tailOne.next;
                current=current.next;
            }
            else
            {
                tailTwo.next=current;
                tailTwo=tailTwo.next;
                current=current.next;
            }
        }
        if(headOne==tailOne)
        {
            tailZero.next=headTwo.next;
        }
        else
        {
            tailZero.next=headOne.next;
        }
        tailOne.next=headTwo.next;
        tailTwo.next=null;
        return headZero.next;

    }
}
