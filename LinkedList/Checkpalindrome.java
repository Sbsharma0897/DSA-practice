public class Checkpalindrome {
    public static void main(String[] args) {
        // This problem checks if a list in palin or not and uses different methods to do
        //various jobs , like reverse a part, get middle of list.
    }
    boolean isPalindrome(Node head)
    {
        if(head==null || head.next==null)
        {
            return true;
        }

        Node pre=getMid(head);
        Node mid=pre.next;
        pre.next=reverse(mid);

        mid=pre.next;
        Node fast=mid;
        Node slow=head;
        while(fast!=null && slow!=mid)
        {
            if(slow.data!=fast.data)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;



    }
    static Node getMid(Node head)
    {
        Node pre=null;
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    static Node reverse(Node head)
    {
        Node current=head;
        Node pre=null;
        Node forward=null;
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
