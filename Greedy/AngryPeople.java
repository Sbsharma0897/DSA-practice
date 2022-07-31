import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.BufferedReader;


public class AngryPeople {

    static int Party(int[] angry,int N)
    {

        Arrays.sort(angry);

        int[] requiredOrder=new int[N];

        int index=0;
        int i=0;
        int a=0;
        int b=N-1;
        while(i<N)
        {
            requiredOrder[a]=angry[i];
            i++;
            if(i<N )
            {
                requiredOrder[b]=angry[i];
            }

            i++;
            a++;
            b--;

        }

        int maxdiff=0;
        //System.out.println(Arrays.toString(requiredOrder));
        //System.out.println(Arrays.toString(angry));
        for(i=0;i<N-1;i++)
        {
            int diff=Math.abs(requiredOrder[i+1]-requiredOrder[i]);
            if(diff>maxdiff)
            {
                maxdiff=diff;
            }

        }
        return maxdiff;
    }
    public static void main(String[] args) throws IOException{

        //You have a circular dining table and N angry people.You need to place them on the table.Each person has a anger value.
        //
        //You can place them in any order on the circular table.Once you place them you need to calculate the Danger value of your arrangement.
        //
        //The danger value of the arrangement is the maximum difference of anger values of all the adjacent seated persons.You need to keep this danger value as low as possible

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine().trim());

        String line1[]=reader.readLine().trim().split(" ");
        int[] angry=new int[N];

        for(int i=0;i<N;i++)
        {
            angry[i]=Integer.parseInt(line1[i]);
        }



        System.out.println(Party(angry,N));

    }
}

