public class ReplaceEveryElementOnRight {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/replace-every-element-with-the-least-greater-element-on-its-right/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
    }
    class Solution {
        public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {

            TreeSet<Integer> set=new TreeSet<>();
            ArrayList<Integer> ans=new ArrayList<>();

            for(int i=n-1;i>=0;i--)
            {
                set.add(arr[i]);
                Object val=set.higher(arr[i]);
                if(val==null)
                {
                    ans.add(-1);
                }
                else
                {
                    ans.add((int)(val));
                }
            }
            Collections.reverse(ans);
            return ans;
        }
    }
}
