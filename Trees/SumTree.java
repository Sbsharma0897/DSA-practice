public class SumTree {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/sum-tree/1
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(Height of the Tree)
    }

    boolean isSumTree(Node root)
    {

        TreeInfo ans=checkBalance(root);
        return ans.balance;
    }

    public TreeInfo checkBalance(Node root)
    {
        if(root==null)
        {
            return new TreeInfo(0,true);
        }
        if(root.left==null && root.right==null)
        {
            return new TreeInfo(root.data,true);
        }


        TreeInfo left=checkBalance(root.left);
        TreeInfo right=checkBalance(root.right);

        int leftsum=left.sum;
        int rightsum=right.sum;


        int sum=leftsum+rightsum;
        boolean sumEqual=root.data==sum;
        if(left.balance && right.balance && sumEqual)
        {
            return new TreeInfo(sum+root.data,true);
        }
        else
        {
            return new TreeInfo(sum+root.data,false);
        }
    }

    class TreeInfo
    {
        int sum;
        boolean balance;

        TreeInfo(int sum,boolean balance)
        {
            this.sum=sum;
            this.balance=balance;
        }
    }
}
