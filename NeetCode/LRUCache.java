public class LRUCache {
    //https://leetcode.com/problems/lru-cache/submissions/
    class Node
    {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    class LRUCache {

        HashMap<Integer,Node> map=new HashMap<>();
        int capacity;
        Node head;
        Node tail;


        public LRUCache(int capacity) {

            this.capacity=capacity;
            this.head=new Node(0,0);
            this.tail=new Node(0,0);
            head.next=tail;
            tail.pre=head;
            head.pre=null;
            tail.next=null;
        }

        public int get(int key) {
            if(map.containsKey(key))
            {
                Node node=map.get(key);
                deleteNode(node);
                addToHead(node);
                return node.value;
            }
            else
            {
                return -1;
            }

        }
        public void deleteNode(Node node)
        {
            node.pre.next=node.next;
            node.next.pre=node.pre;

        }
        public void addToHead(Node node)
        {
            Node forward=head.next;
            head.next=node;
            node.pre=head;
            node.next=forward;
            forward.pre=node;

        }

        public void put(int key, int value) {

            if(map.containsKey(key))
            {
                Node node=map.get(key);
                deleteNode(node);
                Node newNode=new Node(key,value);
                map.put(key,newNode);
                addToHead(newNode);
            }
            else if(map.size()==capacity)
            {
                Node LRU=tail.pre;
                int data=LRU.key;
                deleteNode(LRU);
                map.remove(data);

                Node newNode=new Node(key,value);
                map.put(key,newNode);
                addToHead(newNode);

            }
            else
            {

                Node newNode=new Node(key,value);
                map.put(key,newNode);
                addToHead(newNode);
            }

        }
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> list=new ArrayList<>();
        List<String> output=new ArrayList<>();

        solve(s,output,list,0);
        return list;

    }
    public static void solve(String s,List<String> output,List<List<String>> list,int index)
    {
        if(s.isEmpty())
        {
            list.add(new ArrayList<>(output));
            return;
        }

        for(int i=1;i<=s.length();i++)
        {
            if(isPalin(s.substring(0,i)))
            {
                output.add(s.substring(0,i));
                solve(s.substring(i),output,list,index);
                output.remove(output.size()-1);

            }
        }
    }
    public static boolean isPalin(String s)
    {
        int i=0;
        int j=s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
