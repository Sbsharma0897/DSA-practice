public class RedundantExpression {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/e015cb4d3f354b035d9665e7c8a54a7aefb1901b/1
    }
    public static int checkRedundancy(String string)
    {
        Stack<Character> stack=new Stack<>();

        int size=string.length();
        for(int i=0;i<size;i++)
        {
            if(string.charAt(i)=='(' || string.charAt(i)=='+' || string.charAt(i)=='-' ||
                    string.charAt(i)=='*' || string.charAt(i)=='/')
            {
                stack.push(string.charAt(i));
            }
            else if(string.charAt(i)==')')
            {
                if(stack.peek()=='(')
                {
                    return 1;
                }
                else
                {
                    while(stack.peek()!='(')
                    {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        return 0;
    }
}
