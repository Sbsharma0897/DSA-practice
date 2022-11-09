public class addTWoNumbersLL {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode head=new ListNode(10);
            ListNode tail=head;

            int sum=0;
            int rem=0;
            int taken=0;
            while(l1!=null && l2!=null)
            {

                sum=rem+(l1.val+l2.val);
                taken=sum%10;
                rem=sum/10;

                ListNode newNode=new ListNode(taken);
                tail.next=newNode;
                tail=tail.next;
                l1=l1.next;
                l2=l2.next;
            }
            while(l1!=null)
            {
                sum=rem+(l1.val);
                taken=sum%10;
                rem=sum/10;
                ListNode newNode=new ListNode(taken);
                tail.next=newNode;
                tail=tail.next;
                l1=l1.next;
            }

            while(l2!=null)
            {
                sum=rem+(l2.val);
                taken=sum%10;
                rem=sum/10;
                ListNode newNode=new ListNode(taken);
                tail.next=newNode;
                tail=tail.next;
                l2=l2.next;
            }
            if(rem!=0)
            {
                ListNode newNode=new ListNode(rem);
                tail.next=newNode;
                tail=tail.next;
            }
            tail.next=null;
            return head.next;

        }
    }
}
