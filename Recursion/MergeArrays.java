import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int n=4;
        ArrayList<Integer> array1=new ArrayList<>(
                Arrays.asList(1,5,7,9)
        );
        ArrayList<Integer> array2=new ArrayList<>(
                Arrays.asList(2,4,6,8)
        );

        merge(array1,array2,n);
//

    }
    static void merge(ArrayList<Integer> array1, ArrayList<Integer> array2,int n)
    {
        var i=0;
        var j=0;
        while(i<array1.size() && j<n)
        {

            if(array1.get(i)<=array2.get(j))
            {
                i++;
            }
            else
            {
                array1.add(i,array2.get(j));
                i++;
                j++;
            }
        }
        while(j<n)
        {
            array1.add(array2.get(j));
            j++;
        }
        System.out.println(array1);
    }

}
