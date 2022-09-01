import java.util.Stack;

public class PushatBottom {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        push(stack,5);
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
    public static void push(Stack<Integer> stack,int data)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return ;
        }
        int n=stack.pop();
        push(stack,data);
        stack.push(n);

    }
}
