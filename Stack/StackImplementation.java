public class StackImplementation {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }

    static class Stack
    {
        public Node head;

        public boolean isEmpty()
        {
            if(head==null)
            {
               return true;
            }
            else
            {
                return false;
            }
        }
        public void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
            }
            else
            {
              newNode.next=head;
              head=newNode;
            }
        }
        public void pop()
        {

            if(isEmpty())
            {
                System.out.println("empty stack");
            }
            else
            {
               head=head.next;
            }
        }
        public void peek()
        {

            if(isEmpty())
            {
                System.out.println("empty");
            }
            else
            {
                System.out.println(head.data);
            }
        }
    }
    public static void main(String[] args) {
     Stack stack=new Stack();
     stack.push(5);
        stack.push(6);

        stack.push(8);

        stack.push(2);

        stack.push(0);
        stack.peek();
        stack.pop();
        stack.peek();

    }

}
