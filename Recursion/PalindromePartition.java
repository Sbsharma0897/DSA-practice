import java.util.*;
public class PalindromePartition {
    public static void main(String[] args) {
      String string="madam";
        System.out.println(allPalindromicPerms(string));

        //Given a String S, Find all possible Palindromic partitions of the given String.
        //Input:
        //S = "geeks"
        //Output:
        //g e e k s
        //g ee k s
        //Explanation:
        //All possible palindromic partitions
        //are printed.
    }
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S)
    {
        ArrayList<ArrayList<String>> list= new ArrayList<>();
        ArrayList<String> output=new ArrayList<>();
        int index=0;
        findsubset(S,index,output,list);
        return list;
    }
    static void findsubset(String string,int index,ArrayList<String> output,ArrayList<ArrayList<String>> list)
    {
        if(string.length()==0)
        {
            list.add(new ArrayList<>(output));
            return;
        }
        for (int i = 0; i < string.length(); i++)
        {
          if(isPalindrome(string.substring(0,i+1)))
          {
              output.add(string.substring(0,i+1));
              findsubset(string.substring(i+1),index+i+1,output,list);
              output.remove(output.size()-1);
          }
        }
    }
    static boolean isPalindrome(String string)
    {
        int i=0;
        int j=string.length()-1;
        while(i<j)
        {
            if(string.charAt(i)!=string.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
