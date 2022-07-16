import java.util.HashSet;

public class LinkedListImplementation {

    Node head;
    int size;

    public LinkedListImplementation() {
        this.head = null;
        this.size=0;

    }

    class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node currNode=head;
            while(currNode.next!=null)
            {
                currNode=currNode.next;

            }
            currNode.next=newNode;
        }
        size++;
    }
    public void insertAt(int data,int index)
    {
        Node newNode=new Node(data);
        if(index==0)
        {
            if(head==null)
            {
                head=newNode;
                return;
            }
            else
            {
                newNode.next=head;
                head=newNode;

                return;
            }

        }
        int count=0;
        Node pre=null;
        Node currNode=head;
        while(currNode.next!=null && count!=index)
        {
            pre=currNode;
            currNode=currNode.next;
            count++;
        }
        pre.next=newNode;
        newNode.next=currNode;


    }
    public Node insertRec(int data,int index,Node node)
    {
        System.out.println(node.data);
        if(index==0)
        {
            Node newNode=new Node(data);
            newNode.next=node;
            return newNode;
        }
         node.next=insertRec(data,index-1,node.next);
         return node;

    }
    public void printList()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
        System.out.println();

    }
    public Node get(int index)
    {
        Node curr=head;
        if(index>=this.getSize())
        {
            System.out.println("invalid index");

        }
        else
        {

            for (int i = 0; i <index; i++)
            {
                curr=curr.next;

            }
         return curr;
        }
       return null;

    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }

        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node pre=null;
        Node currNode=head;
        while(currNode.next!=null)
        {
            pre=currNode;
            currNode=currNode.next;
        }
        pre.next=null;
    }
    public void deleteFirst()
    {
        if (head==null)
        {
            System.out.println("Empty List");
            return;
        }
        head=head.next;
        size--;

    }
    public int getSize()
    {
        return this.size;
    }



    public static void main(String[] args) {
        LinkedListImplementation LL=new LinkedListImplementation();
        LL.addFirst(3);
        LL.addFirst(5);
        LL.addFirst(7);
        LL.addFirst(9);
        LL.addFirst(1);
        LL.printList();
        LL.head=LL.insertRec(8,2,LL.head);
        LL.printList();
        HashSet<Node> set=new HashSet<>();
        set.add(LL.head);
        System.out.println(set.contains(LL.head.next));


    }

}

