public class KthSmallestInBST {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1
    }
    int i=0;
    public int KthSmallestElement(Node root, int K) {

        return helper(root,K);

    }
    public int helper(Node root,int k)
    {
        if(root==null)
        {
            return -1;
        }
        int left=KthSmallestElement(root.left,k);

        if(left!=-1)
        {
            return left;
        }
        i++;
        if(i==k)
        {
            return root.data;
        }

        int right=KthSmallestElement(root.right,k);
        if(right!=-1)
        {
            return right;
        }
        return -1;


    }
}
