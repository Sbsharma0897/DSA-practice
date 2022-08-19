public class Bloodline {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        return helper(root).sum;

    }
    public TreeInfo helper(Node root)
    {
        if(root==null)
        {
            return new TreeInfo(0,0);
        }

        TreeInfo left=helper(root.left);
        TreeInfo right=helper(root.right);

        if(left.height>right.height)
        {
            return new TreeInfo(left.sum+root.data,left.height+1);
        }
        else if(left.height<right.height)
        {
            return new TreeInfo(right.sum+root.data,right.height+1);
        }
        else
        {
            if(left.sum>right.sum)
            {
                return new TreeInfo(left.sum+root.data,left.height+1);
            }
            else
            {
                return new TreeInfo(right.sum+root.data,right.height+1);
            }
        }


    }
    static class TreeInfo
    {
        int sum;
        int height;

        TreeInfo(int sum,int height)
        {
            this.sum=sum;
            this.height=height;
        }
    }
}
