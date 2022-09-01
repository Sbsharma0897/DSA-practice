public class ReverseAStack {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
    }
    static void reverse(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int n=stack.pop();
        reverse(stack);
        insertBottom(stack,n);

    }
    public static void insertBottom(Stack<Integer> stack,int data)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return ;
        }
        int n=stack.pop();
        insertBottom(stack,data);
        stack.push(n);

    }
}
