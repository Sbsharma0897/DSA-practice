public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/

        int count=0;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            nums[i]=nums[j];
            i++;
            count++;
            int pre=nums[j];
            while(j<nums.length && nums[j]==pre)
            {
                j++;
            }
        }
        return count;

    }





    public int removeDuplicates(int[] nums) {

        int count=1;
        int i=1;
        int j=1;
        while(j<nums.length)
        {
            if(nums[j-1]==nums[j])
            {
                j++;
            }
            else
            {
                nums[i]=nums[j];
                i++;
                j++;
                count++;
            }
        }
        return count;

    }
    }
}
