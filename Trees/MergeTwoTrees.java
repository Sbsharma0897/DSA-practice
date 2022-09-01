public class MergeTwoTrees {
    public static void main(String[] args) {
   //https://www.geeksforgeeks.org/merge-two-binary-trees-node-sum/
        //Time complexity : O(n)
        //A total of n nodes need to be traversed. Here, n represents the minimum number of nodes from the two given trees.
        //Auxiliary Space : O(n)
        //The depth of the recursion tree can go upto n in case of a skewed tree. In average case, depth will be O(logn).
    }
    static Node MergeTrees(Node t1, Node t2)
    {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.data += t2.data;
        t1.left = MergeTrees(t1.left, t2.left);
        t1.right = MergeTrees(t1.right, t2.right);
        return t1;
    }
}
