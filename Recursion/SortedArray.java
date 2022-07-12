
public class SortedArray {

    public static void main(String[] args) {
        int[] arr={1,33,3,4,5,6,7,8};
        System.out.println(sorted(arr,0));

    }

    static boolean sorted(int[] arr, int index)
    {
        //base condition
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;
        }
        return sorted(arr,index+1) ;
    }


}
