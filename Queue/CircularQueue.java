public class CircularQueue {
    public static void main(String[] args) {

        QueueCircular queue=new QueueCircular(5);
        queue.add(5);
        queue.add(7);
        queue.add(10);
        queue.add(11);
        queue.add(3);
        queue.add(60);
        queue.remove();
        queue.remove();
        queue.peek();

    }
}
class QueueCircular
{
    //Tc-
    //add-1;
    //remove-1;
    //peek-1;

    int[] arr;
    int size;
    int rear;
    int front;


    QueueCircular(int size)
    {
        this.front=-1;
        this.rear=-1;
        this.arr=new int[size];
        this.size=size;


    }
    public boolean isEmpty()
    {
        return front==-1 && rear==-1;
    }
    public boolean isFull()
    {
        return (rear+1)%size==front;
    }
    public void add(int data)
    {
        if(isFull())
        {
            System.out.println("queue is full");
            return;
        }
        if(rear==-1)
        {
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;

    }
    public void remove()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return;
        }

        System.out.println(arr[front]);
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front=(front+1)%size;
        }

    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return;
        }
        else
        {
            System.out.println(arr[front]);
        }
    }

}
