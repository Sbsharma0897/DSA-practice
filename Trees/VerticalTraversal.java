public class VerticalTraversal {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        //TC-worst case-O(logn*logn*N)// we are using treemap
        int X=0;
        int Y=0;
        ArrayList<Integer> ans=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
        helper(root,map,X,Y);
        for( Map.Entry<Integer,TreeMap<Integer,ArrayList<Integer>>> x:map.entrySet())
        {
            for(Map.Entry<Integer,ArrayList<Integer>> y: x.getValue().entrySet())
            {
                ans.addAll(y.getValue());
            }
        }
        return ans;

    }
    static void helper(Node root, TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map,int X,int Y)
    {
        if(root==null)
        {
            return ;
        }
        if(map.containsKey(X))
        {
            TreeMap<Integer,ArrayList<Integer>> dummymap=map.get(X);
            if(dummymap.containsKey(Y))
            {
                ArrayList<Integer> dummy=dummymap.get(Y);
                dummy.add(root.data);
                dummymap.put(Y,dummy);
            }
            else
            {
                dummymap.put(Y,new ArrayList<>(Arrays.asList(root.data)));

            }

        }
        else
        {
            TreeMap<Integer,ArrayList<Integer>> dummymap=new TreeMap<>();
            dummymap.put(Y,new ArrayList<>(Arrays.asList(root.data)));
            map.put(X, dummymap);
        }
        helper(root.left,map,X-1,Y+1);
        helper(root.right,map,X+1,Y+1);

    }
}
