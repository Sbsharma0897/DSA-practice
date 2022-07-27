public class MergeTwoSortedLL {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
     //Given two sorted linked lists consisting of N and M nodes respectively.
        // The task is to merge both of the list (in-place) and return head of the merged list.
    }
    Node sortedMergeONEMETHOD(Node head1, Node head2) {
        Node dummyHead=new Node(5);
        Node tail=dummyHead;
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data)
            {
                tail.next=head1;
                tail=head1;
                head1=head1.next;

            }
            else
            {
                tail.next=head2;
                tail=head2;
                head2=head2.next;

            }
        }
        if(head1!=null)
        {
            tail.next=head1;
        }
        if(head2!=null)
        {
            tail.next=head2;
        }

        return dummyHead.next;
    }

    Node sortedMerge(Node head1, Node head2)
    {
        Node newHead=null;
        Node mainline=null;
        Node secondline=null;
        Node pre=null;
        if(head1.data<=head2.data)
        {
            newHead=head1;
            pre=head1;
            mainline=head1.next;
            secondline=head2;
        }
        else
        {
            newHead=head2;
            pre=head2;
            mainline=head2.next;
            secondline=head1;
        }

        while(mainline!=null && secondline!=null)
        {
            if(secondline.data<=mainline.data && secondline.data>=pre.data)
            {
                pre.next=secondline;
                Node secforward=secondline.next;
                pre=secondline;
                secondline.next=mainline;
                secondline=secforward;

            }
            else
            {
                Node firstforward=mainline.next;
                pre=mainline;
                mainline=firstforward;
            }
        }
        if(secondline!=null)
        {
            pre.next=secondline;
        }
        return newHead;
    }
}
