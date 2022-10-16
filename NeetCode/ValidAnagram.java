public class ValidAnagram {
    public static void main(String[] args) {
        //https://leetcode.com/problems/valid-anagram/submissions/

        //we can use hashmap also,
        char[] one=s.toCharArray();
        char[] two=t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);


        if(Arrays.equals(one,two))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
