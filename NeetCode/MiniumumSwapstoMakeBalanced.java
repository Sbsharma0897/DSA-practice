public class MiniumumSwapstoMakeBalanced {
    //https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
    class Solution {
        public int minSwaps(String s) {

            Stack<Character> stack=new Stack<>();
            int close=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='[')
                {
                    stack.push(ch);
                }
                else
                {
                    if(stack.size()>0 && stack.peek()=='[')
                    {
                        stack.pop();
                    }
                    else
                    {
                        close++;
                    }
                }
            }
            return (close+1)/2;

        }
    }
}
