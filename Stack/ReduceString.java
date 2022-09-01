public class ReduceString {
    public static void main(String[] args) {
    //https://oj.masaischool.com/contest/5055/problem/7
    }
    public class Main {
        public static void main(String[] args) throws IOException{

            BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

            String str=reader.readLine().trim();
            char[] array=str.toCharArray();
            solve(array);

        }
        public static void solve(char[] array)
        {
            int n=array.length;
            Stack<Character> stack=new Stack<>();


            for(int i=0;i<n;i++)
            {
                if(stack.isEmpty())
                {
                    stack.push(array[i]);
                }
                else
                {
                    if(stack.peek().equals(array[i]))
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(array[i]);
                    }
                }
            }
            if(stack.isEmpty())
            {
                System.out.println("Empty String");
                return;
            }
            for(char x:stack)
            {
                System.out.print(x);
            }
        }
    }
}
