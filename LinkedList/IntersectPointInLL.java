public class IntersectPointInLL {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
   //Given two singly linked lists of size N and M, write
        // a program to get the point where two linked lists intersect each other.
    }
    int intersectPoint(Node head1, Node head2)
    {
        int length1=0;
        int length2=0;

        Node current1=head1;
        Node current2=head2;
        while(current1!=null)
        {
            current1=current1.next;
            length1++;
        }
        while(current2!=null)
        {
            current2=current2.next;
            length2++;
        }
        current1=head1;
        current2=head2;

        if(length1>length2)
        {
            int diff=length1-length2;
            int count=0;
            while(count!=diff)
            {
                current1=current1.next;
                count++;
            }

        }
        else  if(length1<length2)
        {
            int diff=length2-length1;
            int count=0;
            while(count!=diff)
            {
                current2=current2.next;
                count++;
            }
        }
        //System.out.println(current1.data);
        while(current1!=null && current2!=null)
        {
            if(current1==current2)
            {
                return current1.data;
            }
            current1=current1.next;
            current2=current2.next;
        }
        return -1;
    }

}
