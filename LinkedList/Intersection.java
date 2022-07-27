public class Intersection {
    public static void main(String[] args) {
        //Intersection of two sorted Linked lists

    }
    public static Node findIntersection(Node head1, Node head2)
    {
        Node newHead=new Node(10);
        Node newTail=newHead;

        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                Node temp=new Node(head1.data);
                newTail.next=temp;
                newTail=temp;
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.data<head2.data)
            {
                head1=head1.next;
            }
            else
            {
                head2=head2.next;
            }
        }
        return newHead.next;
    }
}
