public class CanPlaceFlowers {
    public static void main(String[] args) {
        //https://leetcode.com/problems/can-place-flowers/
    }

    class Solution {
        public boolean canPlaceFlowers(int[] array, int n) {

            int size=array.length;
            int count=0;

            if(size==1 && array[0]==0)
            {
                count++;
            }

            if(size>=2 && array[0]==0 && array[1]==0)
            {
                array[0]=1;
                count++;
            }
            for(int i=1;i<size-1;i++)
            {
                if(array[i]==1)
                {
                    continue;
                }
                else
                {
                    if(array[i-1]==0 && array[i+1]==0)
                    {
                        array[i]=1;
                        count++;
                    }
                }
            }
            if(size-2>=0 && array[size-1]==0 && array[size-2]==0)
            {
                array[size-1]=1;
                count++;
            }

            if(count>=n)
            {
                return true;
            }
            return false;

        }
    }
}
