import java.util.Arrays;

public class MergeTwoSortedArrrays {
    public static void main(String[] args) {
        //https://leetcode.com/problems/merge-sorted-array/
        //You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
        // representing the number of elements in nums1 and nums2 respectively.
        int[] nums1={2,4,5,6};
        int[] nums2={1,2,5,7,8,};
        mergeOne(nums1,nums2,nums1.length,nums2.length);
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));


    }

    public static void mergeOne(int[] nums1, int[] nums2,int m, int n)
    {
        // This is in place merging , no extra space is used.
        //(n+m)log(n+m)
        //space-0
        int i=0;
        int j=0;
        int k=m-1;
        while(i<m && j<n && i<=k)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else  if(nums1[i]>=nums2[j] )
            {
                int temp=nums1[k];
                nums1[k]=nums2[j];
                nums2[j]=temp;
                k--;
                j++;
            }

        }

    }

    public void mergeInplace(int[] nums1, int m, int[] nums2, int n)
    {
       // This is a two pointer approch to put all elements in one array, the first array has length
        // m+n and hence we star putting elements from the rear of nums1 and comapre by grater digits .

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else  if(nums1[i]<nums2[j])
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                nums1[k]=nums2[j];
                i--;
                k--;
                j--;
            }

        }
        while(j>=0)
        {
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     // using extra space to store the answer
        int[] ans=new int[n+m];
        int k=0;
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(nums1[i]==nums2[j])
            {
                ans[k]=nums1[i];
                k++;
                ans[k]=nums1[i];
                k++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                ans[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            ans[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            ans[k]=nums2[j];
            k++;
            j++;
        }
        //System.out.println(Arrays.toString(ans));
        for(i=0;i<m+n;i++)
        {
            nums1[i]=ans[i];

        }

    }
}
