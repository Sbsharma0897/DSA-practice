public class CountBrackReversal {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1
    }

    int countRev (String s)
    {
        if(s.length()%2==1)
        {
            return -1;
        }
        Stack<Character> stack=new Stack<>();
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{')
            {
                stack.push(ch);
                c1++;
            }
            else if(ch=='}')
            {
                if(!stack.isEmpty() && stack.peek()=='{' )
                {
                    stack.pop();
                    c1--;
                }
                else
                {
                    stack.push(ch);
                    c2++;
                }
            }
        }

        int ans=(int)(Math.ceil(c1/2d)+Math.ceil(c2/2d));
        return ans;
    }
}
