public class ReorderList {
    public static void main(String[] args) {

    }
    Node reorderlist(Node head) {

        Node pre=getMid(head);
        Node mid=pre.next;

        Node secondHead=reverse(mid);
        pre.next=null;

        Node current=head;
        Node forward=null;
        while(current!=null && secondHead!=null)
        {
            forward=current.next;
            current.next=secondHead;
            secondHead=secondHead.next;
            current.next.next=forward;
            current=forward;
        }
        return head;
    }
    static Node getMid(Node head)
    {

        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null)
        {

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    static Node reverse(Node head)
    {
        Node current=head;
        Node pre=null;
        Node forward=head;
        while(current!=null)
        {
            forward=current.next;
            current.next=pre;
            pre=current;
            current=forward;
        }
        return pre;
    }

}
