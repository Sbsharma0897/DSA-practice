public class RootToLeaf {
    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/root-to-leaf-paths/1
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root){

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> dummy=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        helper(root,ans,dummy);
        return ans;

    }
    public void helper(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> dummy)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            dummy.add(root.data);
            ans.add(new ArrayList<>(dummy));
            dummy.remove(dummy.size()-1);
            return;
        }

        dummy.add(root.data);
        helper(root.left,ans,dummy);
        helper(root.right,ans,dummy);
        dummy.remove(dummy.size()-1);




    }
}
