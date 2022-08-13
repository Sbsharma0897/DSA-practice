public class RightVIEW {
    public static void main(String[] args) {

    }
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(node,0,ans);
        return ans;
        //Expected Time Complexity: O(N).
        //Expected Auxiliary Space: O(Height of the Tree).
    }
    void solve(Node root,int level, ArrayList<Integer> ans)
    {
        if(root==null)
        {
            return ;
        }
        if(ans.size()==level)
        {
            ans.add(root.data);
        }
        solve(root.right,level+1,ans);
        solve(root.left,level+1,ans);
    }
}
