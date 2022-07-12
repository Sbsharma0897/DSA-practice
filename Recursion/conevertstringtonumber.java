
public class conevertstringtonumber {

    public static void main(String[] args) {
        String string="123456";
        System.out.println(getInteger(string));
    }
    static int getInteger(String string)
    {
        if(string.length()==0)
        {
            return 0;
        }
        int temp = Integer.parseInt(string.substring(0, string.length() - 1));

        return getInteger(string.substring(0,string.length()-1))*10 +string.charAt(string.length()-1);
    }
}
