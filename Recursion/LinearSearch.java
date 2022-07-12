import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={1,33,7,4,5,6,7,7};
        System.out.println(find(arr,0,1));
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println( findAllIndex(arr,0,7,list));
        System.out.println(count);
       ;


    }

    static boolean find(int[] arr, int index,int target)
    {
        //base condition
        if(index==arr.length)
        {
            return false ;
        }

        return arr[index]==target || find(arr,index+1,target);
    }
//    static ArrayList<Integer> list=new ArrayList<>();
//    static void findAllIndex(int[] arr,int index,int target)
//    {
//        if(index==arr.length)
//        {
//            return;
//        }
//        if(arr[index]==target)
//        {
//            list.add(index);
//        }
//        findAllIndex(arr,index+1,target);
//    }

    static ArrayList findAllIndex(int[] arr, int index, int target, ArrayList<Integer> list)
    {

        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAllIndex(arr,index+1,target,list);
    }


}
