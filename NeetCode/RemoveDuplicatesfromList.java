public class RemoveDuplicatesfromList {
    public static void main(String[] args) {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
    }
    public ListNode deleteDuplicates(ListNode head) {


        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode main=head;
        ListNode pre=head;
        ListNode current=head.next;

        while(current!=null)
        {
            if(pre.val==current.val)
            {
                pre=current;
                current=current.next;
            }
            else
            {
                head.next=current;
                head=current;
                pre=current;
                current=current.next;
            }
        }
        head.next=null;
        return main;

    }








    void removeDuplicates()
    {
        /*Another reference to head*/
        Node curr = head;

        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while(temp!=null && temp.data.equals(curr.data)) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
    }

}
