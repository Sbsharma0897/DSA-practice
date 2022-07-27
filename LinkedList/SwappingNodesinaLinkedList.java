public class SwappingNodesinaLinkedList {
    public static void main(String[] args) {
    //https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
  //You are given the head of a linked list, and an integer k.
        //
        //Return the head of the linked list after swapping the values of the kth node from the
        // beginning and the kth node from the end (the list is 1-indexed).
    }
    public ListNode swapNodes(ListNode head, int k)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode firstPre=dummyNode;
        ListNode firstk=head;
        ListNode secondPre=dummyNode;
        ListNode secondk=head;

        ListNode current=head;
        ListNode pre=dummyNode;
        int length=0;
        while(current!=null)
        {
            current=current.next;
            length++;
        }
        //System.out.println(length);
        current=head;
        int count=1;
        while(current!=null)
        {
            if(count==k)
            {
                firstPre=pre;
                firstk=current;
            }
            if(count==length-k+1)
            {
                secondPre=pre;
                secondk=current;
            }
            pre=current;
            current=current.next;
            count++;
        }

        if(firstk==secondPre)
        {
            ListNode forward=secondk.next;
            System.out.println(firstPre.val);
            firstPre.next=secondk;
            secondk.next=firstk;
            firstk.next=forward;
        }
        else if(secondk==firstPre)
        {
            ListNode forward=firstk.next;
            secondPre.next=firstk;
            firstk.next=secondk;
            secondk.next=forward;
        }
        else
        {
            ListNode forward=firstk.next;
            firstPre.next=secondk;
            firstk.next=secondk.next;
            secondPre.next=firstk;
            secondk.next=forward;

        }
        return dummyNode.next;


    }
}
