public class IntersectionOfLinkedList {
    public static void main(String[] args) {
        //https://leetcode.com/problems/intersection-of-two-linked-lists/
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            int length1=0;
            ListNode current=headA;
            while(current!=null)
            {
                length1++;
                current=current.next;
            }
            int length2=0;
            current=headB;
            while(current!=null)
            {
                length2++;
                current=current.next;
            }

            if(length1<length2)
            {
                int dif=length2-length1;
                while(dif!=0)
                {
                    dif--;
                    headB=headB.next;
                }
            }
            else if(length1>length2)
            {
                int dif=length1-length2;
                while(dif!=0)
                {
                    dif--;
                    headA=headA.next;
                }
            }

            while( headA!=null && headB!=null && headA!=headB)
            {
                headA=headA.next;
                headB=headB.next;
            }
            return headA;


        }
    }
}
