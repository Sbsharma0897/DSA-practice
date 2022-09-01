public class MergeTwoBST {
    public static void main(String[] args) {
   //https://practice.geeksforgeeks.org/problems/merge-two-bst-s/1
    }
    public List<Integer> merge(Node root1,Node root2)
    {
        //Time complexity of this method is O(m+n) which is better than method 1.
        // This method takes O(m+n) time even if the input BSTs are not balanced.
        //S.C-O(M+N)
        List<Integer> array1=new ArrayList<>();
        List<Integer> array2=new ArrayList<>();
        helper(array1,root1);
        helper(array2,root2);

        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<array1.size() && j<array2.size())
        {
            if(array1.get(i)<array2.get(j))
            {
                ans.add(array1.get(i));
                i++;
            }
            else if(array1.get(i)>array2.get(j))
            {
                ans.add(array2.get(j));
                j++;
            }
            else
            {
                ans.add(array2.get(j));
                j++;
            }
        }
        while(i<array1.size())
        {
            ans.add(array1.get(i));
            i++;
        }
        while(j<array2.size())
        {
            ans.add(array2.get(j));
            j++;
        }

        return ans;
    }
    public void helper( List<Integer> array,Node root)
    {
        if(root==null)
        {
            return;
        }
        helper(array,root.left);
        array.add(root.data);
        helper(array,root.right);

    }

    Node sortedArrayToBST(int arr[], int start, int end) {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);

        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }
}
}
