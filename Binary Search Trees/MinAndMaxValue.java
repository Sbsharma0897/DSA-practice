public class MinAndMaxValue {
    public static void main(String[] args) {

    }
    public MinValue(root)
    {
        Node temp=root;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp;
    }
    public MaxValue(root)
    {
        Node temp=root;
        while(temp.right!=null)
        {
            temp=temp.right;
        }
        return temp;
    }
}
