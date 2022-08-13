public class ImplementationArray {
    public static void main(String[] args) {

        Queue<Number> queue=new Queue<Number>(6);
        queue.add(5);
        queue.add(7);
        queue.add(10);

        queue.add(3);
        queue.add(60);
        queue.remove();
        queue.print();


    }
}
class Queue<I extends Number> {

    //This is implmentation of queue using array, here add has O(1), removeO(n),and peek O(1).
    //To remove the r O(n) time we use circular queue. below i have written front and did front++;
    //this is wrong as in normal impleneation we only push the elements in front by one by during remove
    //function. and hence we can only work with arr,size and rear properties below.In this implementation
    //we are either wasting space in the array by front++ or taking more time to push elemnts in front during
    //remove task.
    int[] arr;
    int size;
    int rear;
    int front;
    int capacity;

    Queue(int size)
    {
        this.front=-1;
        this.rear=-1;
      this.arr=new int[size];
      this.size=0;
      this.capacity=size;

    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void add(int data)
    {
        if(size==capacity)
        {
            System.out.println("queue is full");
            return;
        }
        if(rear==-1)
        {
            front=0;
        }
        rear++;
        size++;
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
        front++;
        size--;

    }
    public void print()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

}