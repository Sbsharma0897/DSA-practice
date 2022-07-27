public class Add1ToNumberLL {
    public static void main(String[] args) {
   //Add 1 to a number represented as linked list
        //A number N is represented in Linked List such that each digit corresponds to a node
        // in linked list. You need to add 1 to it.
    }
    public static Node addOne(Node head)
    {
        Node newHead=reverse(head);
        Node current=newHead;
        Node pre=null;
        int sum=0;
        int carry=1;
        while(current!=null)
        {
            sum=current.data+carry;
            if(sum<10)
            {
                current.data=sum;
                carry=0;

            }
            else
            {
                current.data=0;
                carry=1;
            }
            pre=current;
            current=current.next;
        }
        if(carry==1)
        {
            Node temp=new Node(1);
            pre.next=temp;
        }
        return reverse(newHead);

    }
    public static Node reverse(Node head)
    {
        Node current=head;
        Node pre=null;
        Node forward=null;
        while(current!=null)
        {
            forward=current.next;
            current.next=pre;
            pre=current;
            current=forward;
        }
        return pre;
    }

    static class Node
    {
        int data;
        Node next;
    }

    /* Function to create a new node with given data */
    static Node newNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }

    // Recursively add 1 from end to beginning and returns
    // carry after all nodes are processed.
    static int addWithCarry(Node head)
    {

        // If linked list is empty, then
        // return carry
        if (head == null)
            return 1;

        // Add carry returned be next node call
        int res = head.data + addWithCarry(head.next);

        // Update data and return new carry
        head.data = (res) % 10;
        return (res) / 10;
    }

    // This function mainly uses addWithCarry().
    static Node addOne(Node head)
    {

        // Add 1 to linked list from end to beginning
        int carry = addWithCarry(head);

        // If there is carry after processing all nodes,
        // then we need to add a new node to linked list
        if (carry > 0)
        {
            Node newNode = newNode(carry);
            newNode.next = head;
            return newNode; // New node becomes head now
        }

        return head;
    }

    // A utility function to print a linked list
    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    /* Driver code */
    public static void main(String[] args)
    {
        Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(9);

        System.out.print("List is ");
        printList(head);

        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
    }
}
}
