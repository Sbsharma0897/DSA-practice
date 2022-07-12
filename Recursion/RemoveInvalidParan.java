import java.util.ArrayList;
import java.util.Stack;

public class RemoveInvalidParan {
    public static void main(String[] args)
        {
            String string="(a)())()";
            ArrayList<String> list= new ArrayList<>();
            int min=checkbalance(string);
            //System.out.println(min);
            String output="";
            //for optimation of code(to avoid TLE, we can use hashmap whuch stores all the enw string,
            //so incase we are working on same string again we can return back and save that time
            solve(string,output,list,min);
            System.out.println(list);

        }

        private static void solve(String string,String output,ArrayList<String> list,int min)
        {
            //System.out.println(string);
            if(min==0)
            {
               int stacksize=checkbalance(string);
               if(stacksize==0)
               {
                   list.add(string);
                   return;
               }
               return;

            }
            String processed;
            for (int i = 0; i < string.length(); i++)
            {
                if(string.charAt(i)!=')' && string.charAt(i)!='(' )
                {
                    continue;
                }
                else
                {
                    processed= string.substring(0,i)+string.substring(i+1);
                    solve(processed,output,list,min-1);
                }

            }

        }
        private static int checkbalance(String string)
        {
            Stack<Character> stack=new Stack<>();
            for (int i = 0; i < string.length(); i++)
            {
                if(stack.isEmpty())
                {
                    if(string.charAt(i)=='(' || string.charAt(i)==')')
                    {
                        stack.push(string.charAt(i));
                    }

                }
                else if(string.charAt(i)==')' && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    if(string.charAt(i)=='(' || string.charAt(i)==')')
                    {
                        stack.push(string.charAt(i));
                    }
                }
            }
            return stack.size();
        }
}
