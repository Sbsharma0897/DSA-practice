import java.util.*;
public class PermutationIMPORTANT {

    public static void main(String[] args) {

//        int[] array={1,2,3};
////        permute(array,"");
//        permuteWitharray(array,0);
        String string="ABB";


        ArrayList<String> list =new ArrayList<>();
        ArrayList<String> output=new ArrayList<>();

        permuteWithBacktrack(string,output,list);
        Set<String> set= new HashSet<>(list);
        Collections.sort(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);

    }

    static void permuteWithBacktrack(String string, ArrayList<String> output, ArrayList<String> list)
    {
        if(string.length()==0)
        {
            ArrayList<String> temp=new ArrayList<>(output);
            list.add(String.join("", temp));
            return;
        }
        for(int i=0;i<string.length();i++)
        {
            output.add(String.valueOf(string.charAt(i)));
            String nextstep=string.substring(0,i)+string.substring(i+1);
            permuteWithBacktrack(nextstep,output,list);
            output.remove(output.size()-1);

        }
    }

    static void permute(int[] array,String ans)
    {
        if(array.length==0)
        {
            System.out.println(ans);
            return;
        }
        int element=array[0];
        int[] newarray = Arrays.copyOfRange(array, 1, array.length);
        for(int i=0;i<=ans.length();i++)
        {
           String completed=ans.substring(0,i)+element+ans.substring(i);
           permute(newarray,completed);
        }
    }

    static void permuteWitharray(int[] array,int index)
    {
        if(index==array.length-1)
        {
            System.out.println(Arrays.toString(array));
            return;
        }
        for(int i=index;i<array.length;i++)
        {
           swap(array,i,index) ;
           permuteWitharray(array,index+1);
           swap(array,i,index) ;

        }
    }
    static void swap(int[] array,int i,int index)
    {
        int temp=array[i];
        array[i]=array[index];
        array[index]=temp;

    }







    class Solution {
        public List<List<Integer>> permute(int[] nums) {

            List<List<Integer>> list=new ArrayList<>();


            int index=0;
            solve(nums,index,list);
            return list;

        }
        public void solve(int[] nums,int index,List<List<Integer>> list)
        {
            if(index==nums.length)
            {
                List<Integer> output=new ArrayList<>();
                for(int i=0;i<nums.length;i++)
                {
                    output.add(nums[i]);
                }
                list.add(new ArrayList<>(output));
                return;
            }

            for(int i=index;i<nums.length;i++)
            {
                swap(nums,index,i);
                solve(nums,index+1,list);
                swap(nums,index,i);

            }
        }
        public void swap(int[] nums,int i,int j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }
    }

}
