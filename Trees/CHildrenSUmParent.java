public class CHildrenSUmParent {
    public static void main(String[] args) {
     //https://practice.geeksforgeeks.org/problems/children-sum-parent/1
    }
    public static int isSumProperty(Node root)
    {

        if(root.left==null && root.right==null)
        {
            return 1;
        }
        if(root.left!=null && root.right==null)
        {
            if(root.data!=root.left.data)
            {
                return 0;
            }
            else
            {
                return isSumProperty(root.left);
            }

        }
        if(root.right!=null && root.left==null)
        {
            if(root.data!=root.right.data)
            {
                return 0;
            }
            else
            {
                return isSumProperty(root.right);
            }

        }
        if(root.left!=null && root.right!=null)
        {
            if(root.data==root.right.data+root.left.data)
            {
                int a=isSumProperty( root.left);
                int b=isSumProperty( root.right);
                if(a==1 && b==1)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                return 0;
            }
        }
        return 0;


    }
}
