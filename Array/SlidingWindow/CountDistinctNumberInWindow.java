package SlidingWindow;

public class CountDistinctNumberInWindow {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
    }
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;

        for(int j=0;j<n;j++)
        {
            if(map.containsKey(A[j]))
            {
                map.put(A[j],map.get(A[j])+1);
            }
            else
            {
                map.put(A[j],1);
            }

            if(j-i+1==k)
            {
                ans.add(map.size());

                if(map.get(A[i])==1)
                {
                    map.remove(A[i]);
                }
                else
                {
                    map.put(A[i],map.get(A[i])-1);
                }
                i++;
            }
        }
        return ans;
    }
}
