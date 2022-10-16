public class MergeTwoSortedLISts {
    public static void main(String[] args) {
       //https://leetcode.com/problems/merge-two-sorted-lists/
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head=new ListNode(-1);
        ListNode tail=head;

        while(list1!=null && list2!=null)
        {
            if(list1.val==list2.val)
            {
                tail.next=list1;
                tail=list1;
                list1=list1.next;

            }
            else if(list1.val<list2.val)
            {
                tail.next=list1;
                tail=list1;
                list1=list1.next;
            }
            else
            {
                tail.next=list2;
                tail=list2;
                list2=list2.next;
            }
        }
        if(list1!=null)
        {
            tail.next=list1;
        }
        if(list2!=null)
        {
            tail.next=list2;
        }
        return head.next;


    }
}
