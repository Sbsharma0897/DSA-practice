public class ValidExpression {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/valid-expression1025/1
    }
    boolean valid(String s)
    {
        Stack<Character> stack=new Stack<>();
        int size=s.length();
        for(int i=0;i<size;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if(s.charAt(i)==')' && stack.peek()=='(')
                {
                    stack.pop();
                }
                else if(s.charAt(i)==']' && stack.peek()=='[')
                {
                    stack.pop();
                }
                else if(s.charAt(i)=='}' && stack.peek()=='{')
                {
                    stack.pop();
                }
                else

                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
