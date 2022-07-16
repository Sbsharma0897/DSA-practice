public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] array={1,4,5,7,8,9,11,16,19};
        int target=1212;
        System.out.println(search(array,target,0,array.length-1 ));
    }
    static int search(int[] array,int target,int i, int j)
    {
        if(i>j)
        {
            return -1;
        }
        int m=i+(j-i)/2;

        if(array[m]==target)
        {
            return m;
        }
        else if(array[m]>target)
        {
            return search(array,target,i,m-1);
        }
        else
        {
            return search(array,target,m+1,j);
        }
    }
}
