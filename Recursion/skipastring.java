public class skipastring {

    public static void main(String[] args) {
        String string="bcadhaad ";
        System.out.println(removea(string));
//        System.out.println(removestring(string));
    }
    static String removea(String string)
    {
        if(string.isEmpty())
        {
            return "";
        }
        char ch=string.charAt(0);
        if(ch=='a')
        {
            return removea(string.substring(1));
        }
        else
        {

            return ch+ removea(string.substring(1));
        }


    }
    static String removestring(String string)
    {
        if(string.isEmpty())
        {
            return "";
        }

        if(string.startsWith("apple"))
        {
            return removestring(string.substring(5));
        }
        else
        {

            return string.charAt(0)+ removestring(string.substring(1));
        }


    }
}
