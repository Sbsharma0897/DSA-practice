
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] array={11,14,17,1,4,5,8,9,10};
        int target=11212;
        System.out.println(search(array,target,0,array.length-1 ));


    }

    static int search(int[] array,int target,int i,int j)
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
        else if(array[m]>=array[i])
        {
            if(target<=array[m] && target>=array[i])
            {
                return search(array,target,i,m-1);
            }
            else
            {
                return search(array,target,m+1,j);
            }
        }
       else
        {
            if(target<=array[j] && target>=array[m])
            {
                return search(array,target,m+1,j);
            }
            else
            {
                return search(array,target,i,m-1);
            }
        }

    }
}
