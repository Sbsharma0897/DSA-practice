public class TreeToBST {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1
    }
    Node binaryTreeToBST(Node root)
    {
        //Time Complexity: O(nlogn). This is the complexity of the sorting algorithm which we are using after first in-order traversal, rest of the operations take place in linear time.
        //Auxiliary Space: O(n). Use of data structure ‘array’ to store in-order traversal.
        ArrayList<Integer> array=new ArrayList<>();
        helper(root,array);
        Collections.sort(array);
        int size=array.size();
        return sortedArrayToBST(array,0,size-1);
    }
    public void helper(Node root,ArrayList<Integer> array)
    {
        if(root==null)
        {
            return;
        }
        helper(root.left,array);
        array.add(root.data);
        helper(root.right,array);

    }
    Node sortedArrayToBST(ArrayList<Integer> array, int start, int end)
    {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(array.get(mid));

        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = sortedArrayToBST(array, start, mid - 1);

        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = sortedArrayToBST(array, mid + 1, end);

        return node;
    }
}
