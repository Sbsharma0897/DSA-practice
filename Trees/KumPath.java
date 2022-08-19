public class KumPath {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/a-sum-paths/1
    }
    public int sumK(Node root,int k)
    {
        //THis is using YC-O(n^2) and it is giving TLE. here we are firsy going to every node and then from
        //that node we are traversing its complet path.
        if(root==null)
        {
            return 0;
        }
        int amount=0;
        int count=0;
        count=subtree(root,k,amount);
        count +=sumK(root.left,k);
        count +=sumK(root.right,k);
        return count;
    }
    public int subtree(Node root,int k,int amount)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        amount +=root.data;
        if(amount==k)
        {
            count++;
        }

        count += subtree(root.left,k,amount)+subtree(root.right,k,amount);
        amount=amount-root.data;
        return count;

    }







    public int sumK(Node root,int k)
    {//TC-O(N), this is same approach as subaaray sum equal k in arrays topic  using map
        HashMap<Integer,Integer> map=new HashMap<>();
        int currsum=0;
        return helper(root,k,currsum,map);

    }
    public int helper(Node root,int k,int currsum, HashMap<Integer,Integer> map)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        currsum +=root.data;
        if(currsum==k)
        {
            count++;
        }

        if(map.containsKey(currsum-k))
        {
            count +=map.get(currsum-k);
        }

        if(map.containsKey(currsum))
        {
            map.put(currsum,map.get(currsum)+1);
        }
        else
        {
            map.put(currsum,1);
        }
        count+= helper(root.left,k,currsum,map);

        count+=helper(root.right,k,currsum,map);


        map.put(currsum,map.get(currsum)-1);


        return count;

    }
}
