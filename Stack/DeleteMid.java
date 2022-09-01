public class DeleteMid {
    public static void main(String[] args) {
      //https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
    }
    public void deleteMid(Stack<Integer>stack,int sizeOfStack){

        int size=sizeOfStack;
        int forMid=(size+1)/2;
        int mid=size+1-forMid;
        int count=1;
        helper(stack,mid,count);
    }
    public void helper(Stack<Integer>stack,int mid,int count)
    {
        if(count==mid)
        {
            stack.pop();
            return;
        }
        count++;
        int n=stack.pop();
        helper(stack,mid,count);
        stack.push(n);
    }
}
