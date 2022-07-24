public class MajorityElement {
    public static void main(String[] args) {
//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
        //Given an array A of N elements. Find the majority element in the array.
        // A majority element in an array A of
        // size N is an element that appears more than N/2 times in the array.
    }

    static int majorityElement(int a[], int size)
    {
        int range=size/2;

        int ele=0;
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(count==0)
            {
                ele=a[i];
            }

            if(ele==a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==ele)
            {
                count++;
            }
        }
        if(count>range)
        {
            return ele;
        }
        else

        {
            return -1;
        }

    }
}
