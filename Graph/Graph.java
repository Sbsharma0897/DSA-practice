import java.util.*;

public class Graph {

    HashMap<Integer,ArrayList<Integer>> map;
    Graph()
    {
        map=new HashMap<>();
    }
    void addEdge(int u,int v,int direction)
    {
        if(map.containsKey(u))
        {
            ArrayList<Integer> dummy=map.get(u);
            dummy.add(v);
            map.put(u,dummy);
        }
        else {
            map.put(u,new ArrayList<>(Arrays.asList(v)));
        }
        if(direction==0)
        {
            if(map.containsKey(v))
            {
                ArrayList<Integer> dummy=map.get(v);
                dummy.add(u);
                map.put(v,dummy);
            }
            else {
                map.put(v,new ArrayList<>(Arrays.asList(u)));
            }
        }
    }
    void printGraph()
    {
        for (int x:map.keySet())
        {
            System.out.println(x+" : "+map.get(x));
        }
    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            System.out.println("enter value of u and v");
            int u=sc.nextInt();
            int v=sc.nextInt();
            System.out.println("enter durection");
            int d=sc.nextInt();
            graph.addEdge(u,v,d);
        }
        graph.printGraph();

    }
}
