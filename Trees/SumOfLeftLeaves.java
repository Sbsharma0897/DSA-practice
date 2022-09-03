public class SumOfLeftLeaves {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/sum-of-left-leaf-nodes/1
    }
    public int leftLeavesSum(Node root)
    { int value=0;
        if(root==null)
        {
            return 0;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            value=root.left.data;
        }
        value =value+leftLeavesSum(root.left);
        value =value+leftLeavesSum(root.right);

        return value;
    }

}
