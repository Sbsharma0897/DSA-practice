public class SortSatck {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/sort-a-stack/1
    }
    public Stack<Integer> sort(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return stack;
        }
        int x=stack.pop();
        sort(stack);
        Insert(stack,x);
        return stack;
    }
    public void Insert(Stack<Integer> stack,int x)
    {
        if(stack.isEmpty())
        {
            stack.push(x);
            return;
        }
        if(stack.peek()<x)
        {
            stack.push(x);
            return;
        }
        int n=stack.pop();
        Insert(stack,x);
        stack.push(n);

    }
}
