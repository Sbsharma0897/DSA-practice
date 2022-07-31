public class IslandSurvive {
    public static void main(String[] args) {
    //https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-survive-on-island4922/1
        // Ishika got stuck on an island. There is only one shop on this island and it is open on all days of the week except for Sunday. Consider following constraints:
        //
        //N – The maximum unit of food you can buy each day.
        //S – Number of days you are required to survive.
        //M – Unit of food required each day to survive.
    }
    static int minimumDays(int S, int N, int M){

        if(M>N || (6*N<=7*M && S>=7))
        {
            return -1;
        }
        if(M==N && S>=7)
        {
            return -1;
        }

        double total=M*S;
        double ans=Math.ceil(total/N);

        return  (int)ans;
    }
}
