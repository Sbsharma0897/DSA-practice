import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArray {

    public static void main(String[] args) {

        ArrayList<Integer> array= new ArrayList<>(
                Arrays.asList(5,8,4,2,9,0,1,2,3,4,5,6,7,8)
        );
        System.out.println(sort(array));
    }
    static ArrayList<Integer> sort(ArrayList<Integer> array)
    {
        if(array.size()==1)
        {
            return array;
        }
        int temp=array.remove(array.size()-1);
        sort(array);

        return insert(array,temp);


    }
    static ArrayList<Integer> insert(ArrayList<Integer> array,int temp)
    {
        if(array.size()==0 || array.get(array.size()-1)<=temp )
        {
            array.add(temp);
            return array;
        }

            int lastele=array.remove(array.size()-1);
            insert(array,temp);
            array.add(lastele);
            return array;



    }

}
