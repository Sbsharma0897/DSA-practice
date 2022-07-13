public class MergeSortME {
    public static void main(String[] args) {

    }
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
// divide and get sorted lists
        Node mid=getMiddle(head);
        Node left=mergeSort(head);
        Node right=mergeSort(mid);

        return merge(left,right);


    }
    static Node merge(Node list1,Node list2)
    {/// merge 2 lists
        Node dummyHead=new Node(0);
        Node tail=dummyHead;
        while(list1!=null && list2!=null)
        {
            if(list1.data<list2.data)
            {
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else
            {
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
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

        return dummyHead.next;
    }
    static Node getMiddle(Node node)
    {

// split list
        Node slow = node;
        Node fast = node.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = slow.next;
        slow.next = null;
        return mid;

//        int length=0;
//        Node curr=node;
//        while(curr!=null)
//        {
//            curr=curr.next;
//            length++;
//        }
//
//        int mid=(length/2)+1;
//
//        curr=node;
//        Node pre=null;
//        int count=1;
//        while(count!=mid)
//        {
//            pre=curr;
//            curr=curr.next;
//            count++;
//        }
//        pre.next=null;
//        return curr;
    }
}
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
}
