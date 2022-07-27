public class OddEvenLL {
    public static void main(String[] args) {
   //https://leetcode.com/problems/odd-even-linked-list/
        //Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
        //
        //The first node is considered odd, and the second node is even, and so on.
        //
        //Note that the relative order inside both the even and odd groups should remain as it was in the input.
        //
        //You must solve the problem in O(1) extra space complexity and O(n) time complexity.
    }
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead=new ListNode(10);
        ListNode evenHead=new ListNode(10);
        ListNode oddTail=oddHead;
        ListNode evenTail=evenHead;

        ListNode current=head;
        int count=1;
        while(current!=null)
        {
            if(count%2==1)
            {
                oddTail.next=current;
                oddTail=current;
            }
            else
            {
                evenTail.next=current;
                evenTail=current;
            }
            current=current.next;
            count++;
        }
        oddTail.next=evenHead.next;
        evenTail.next=null;
        return oddHead.next;

    }
}
