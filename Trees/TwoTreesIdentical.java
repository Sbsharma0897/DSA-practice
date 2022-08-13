public class TwoTreesIdentical {
    public static void main(String[] args) {
  //https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
    }
    boolean isIdentical(Node root1, Node root2)
    {
        //TC-O(n)

        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        if(root1.data==root2.data)
        {
            if (isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right))
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        else
        {
            return false;
        }
    }

}
