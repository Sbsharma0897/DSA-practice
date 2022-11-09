public class SortArrayAccordingtoOter {
    public static void main(String[] args) {
       //https://practice.geeksforgeeks.org/problems/relative-sorting4323/1?page=2&curated
    }
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i<N;i++)
        {
            int val=A1[i];
            if(map.containsKey(val))
            {
                map.put(val,map.get(val)+1);
            }
            else
            {
                map.put(val,1);
            }
        }

        int i=0;

        for(int j=0;j<M;j++)
        {
            int val=A2[j];

            while(map.containsKey(val))
            {
                if(map.get(val)==0)
                {
                    map.remove(val);
                }
                else
                {
                    A1[i]=val;
                    map.put(val,map.get(val)-1);
                    i++;
                }
            }
        }

        for(int key:map.keySet())
        {
            int val=map.get(key);
            for(int j=0;j<val;j++)
            {
                A1[i]=key;
                i++;
            }
        }
        return A1;

    }
}
}
