public class ReverseaString {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
    }
    public String reverse(String S){
        Stack<Character> stack=new Stack<>();

        int size=S.length();
        for(int i=0;i<size;i++)
        {
            stack.push(S.charAt(i));
        }

        String ans="";
        while(!stack.isEmpty())
        {
            ans=ans+stack.pop();
        }
        return ans;
    }
}
