import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        String digit="23";

        System.out.println(permutation(digit,""));

    }
    static ArrayList<String> permutation(String digit, String ans)
    {
        if(digit.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=digit.charAt(0);
        ArrayList<String> list=new ArrayList<>();
        if(ch=='2')
        {
            list.addAll(permutation(digit.substring(1),ans+'a'));
            list.addAll(permutation(digit.substring(1),ans+'b'));
            list.addAll(permutation(digit.substring(1),ans+'c'));
        }
        else if(ch=='3')
        {
            list.addAll(permutation(digit.substring(1),ans+'d'));
            list.addAll(permutation(digit.substring(1),ans+'e'));
            list.addAll(permutation(digit.substring(1),ans+'f'));
        }
        else if(ch=='4')
        {
            list.addAll(permutation(digit.substring(1),ans+'g'));
            list.addAll(permutation(digit.substring(1),ans+'h'));
            list.addAll(permutation(digit.substring(1),ans+'i'));
        }
        else if(ch=='5')
        {
            list.addAll(permutation(digit.substring(1),ans+'j'));
            list.addAll(permutation(digit.substring(1),ans+'k'));
            list.addAll(permutation(digit.substring(1),ans+'l'));
        }
        else if(ch=='6')
        {
            list.addAll(permutation(digit.substring(1),ans+'m'));
            list.addAll(permutation(digit.substring(1),ans+'n'));
            list.addAll(permutation(digit.substring(1),ans+'o'));
        }
        else if(ch=='7')
        {
            list.addAll(permutation(digit.substring(1),ans+'p'));
            list.addAll(permutation(digit.substring(1),ans+'q'));
            list.addAll(permutation(digit.substring(1),ans+'r'));
            list.addAll(permutation(digit.substring(1),ans+'s'));
        }
        else if(ch=='8')
        {
            list.addAll(permutation(digit.substring(1),ans+'t'));
            list.addAll(permutation(digit.substring(1),ans+'u'));
            list.addAll(permutation(digit.substring(1),ans+'v'));
        }
        else if(ch=='9')
        {
            list.addAll(permutation(digit.substring(1),ans+'w'));
            list.addAll(permutation(digit.substring(1),ans+'x'));
            list.addAll(permutation(digit.substring(1),ans+'y'));
            list.addAll(permutation(digit.substring(1),ans+'z'));
        }

        return list;
    }
}
