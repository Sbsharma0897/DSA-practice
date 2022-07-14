public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    static Node addTwoLists(Node first, Node second)
    {

        first=reverse(first);
        second=reverse(second);
        int sum=0;
        int carry=0;
        Node dummyHead= new Node(0);
        Node dummyTail=dummyHead;

        while(first!=null && second!=null)
        {
            sum=carry+first.data+second.data;

            int digit=sum%10;

            addDigit(digit,dummyTail);
            dummyTail=dummyTail.next;

            carry=sum/10;

            first=first.next;
            second=second.next;

        }
        while(first!=null)
        {
            sum=carry+first.data ;
            int digit=sum%10;
            addDigit(digit,dummyTail);
            dummyTail=dummyTail.next;
            carry=sum/10;

            first=first.next;

        }
        while(second!=null)
        {
            sum=carry+second.data ;
            int digit=sum%10;
            addDigit(digit,dummyTail);
            dummyTail=dummyTail.next;
            carry=sum/10;

            second=second.next;

        }

        if(carry!=0)
        {
            addDigit(carry,dummyTail);
            dummyTail=dummyTail.next;

        }


        return reverse(dummyHead.next);

    }
    static void addDigit(int digit,Node dummyTail)
    {

        Node newNode=new Node(digit);
        newNode.next=null;
        dummyTail.next=newNode;



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
