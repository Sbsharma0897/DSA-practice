public class RemoveLoopIMPPP {
    public static void main(String[] args) {

    }
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) // check if loop exists
            {
                slow=head;
                if(slow==fast) // this condition is to see if slow and fast end up at head positon,if they
                    //then move the fast node ahead in loop and stop just before its about to meet slow again
                {
                    while(fast.next!=slow)
                    {
                        fast=fast.next;
                    }
                    fast.next=null;
                    return;
                }
                else //if normal
                { //this is basic case of getting the loop statring point, here we take pre to get tail point and make it null
                    Node pre=null;
                    while(slow!=fast)
                    {
                        pre=fast;
                        slow=slow.next;
                        fast=fast.next;

                    }
                    pre.next=null;
                    return;
                }
            }



        }
    }
}
