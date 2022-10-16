public class ReverseLinkedList {
    public static void main(String[] args) {
       //easy
    }
    class Solution {
        static ListNode newHead=new ListNode(-1);
        public ListNode reverseList(ListNode head) {
            if(head==null)
            {
                return head;
            }


            solve(head).next=null;
            return newHead;

        }
        public static ListNode solve(ListNode node)
        {

            if(node.next==null)
            {
                newHead=node;
                return node;
            }
            //System.out.println(node.val);
            ListNode returned=solve(node.next);
            returned.next=node;
            return node;
        }

}
