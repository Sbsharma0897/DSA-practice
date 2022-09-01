public class StockSpan {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
    }
    public static int[] calculateSpan(int price[], int n)
    {
        int[][] ans=nextGreater(price,n);

        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {

            result[i]=i-ans[i][1];


        }
        return result;
    }
    public static  int[][] nextGreater(int arr[], int n)
    {
        int ans[][]=new int[n][2];
        Stack<ArrayList<Integer>> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                ans[i][0]=-1;
                ans[i][1]=-1;
            }
            else
            {
                while(!stack.isEmpty() && stack.peek().get(0)<=arr[i])
                {
                    stack.pop();

                }
                if(stack.isEmpty())
                {
                    ans[i][0]=-1;
                    ans[i][1]=-1;
                }
                else
                {
                    ans[i][0]=stack.peek().get(0);
                    ans[i][1]=stack.peek().get(1);

                }
            }
            stack.push(new ArrayList<>(Arrays.asList(arr[i],i)));
        }


        return ans;

    }






    public static int[] calculateSpan(int price[], int n)
    {
        //Better and neat code, FROM GFG
        int[] ans=nextGreater(price,n);


        return ans;
    }
    public static  int[] nextGreater(int arr[], int n)
    {
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                ans[i]=i-(-1);

            }
            else
            {
                while(!stack.isEmpty() && arr[stack.peek()]<=arr[i])
                {
                    stack.pop();

                }
                if(stack.isEmpty())
                {
                    ans[i]=i-(-1);
                }
                else
                {
                    ans[i]=i-stack.peek();

                }
            }
            stack.push(i);
        }


        return ans;

    }
}
