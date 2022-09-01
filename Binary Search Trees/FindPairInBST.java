public class FindPairInBST {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1
    }
    public int isPairPresent(Node root, int target)
    {
        //Complexity Analysis:
        //
        //Time Complexity: O(n).
        //Inorder Traversal of BST takes linear time.
        //Auxiliary Space: O(n).
        //Use of array for storing the Inorder Traversal. 
        ArrayList<Integer> array=new ArrayList<>();
        helper(root,array);
        return search(array,target);

    }
    public static void helper(Node root,ArrayList<Integer> array)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,array);
        array.add(root.data);
        helper(root.right,array);

    }
    public static int search(ArrayList<Integer> array,int k)
    {
        int i=0;
        int j=array.size()-1;
        while(i<j)
        {
            int sum=array.get(i)+array.get(j);
            if(sum==k)
            {
                return 1;
            }
            else if(sum<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return 0;

    }
}
