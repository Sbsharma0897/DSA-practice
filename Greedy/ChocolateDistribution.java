public class ChocolateDistribution {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
    }
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        int min=Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0;i<n-m+1;i++)
        {
            int temp=a.get(i+m-1)-a.get(i);
            min=Math.min(temp,min);
        }
        return min;
    }
}
