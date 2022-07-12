package Apnikaksha;

public class ReverseString {
    public static void main(String[] args) {
        String sample="abcd";
        System.out.println(reverse(sample,0));
    }
    static String reverse(String string,int index)
    {
        if(string.length()==0)
        {
            return "";
        }
        char temp=string.charAt(0);
        return reverse(string.substring(1),index+1)+temp;

    }
}
