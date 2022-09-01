import java.util.*;

public class  NMeetingsInOneRoom {
    public static void main(String[] args) {
 //https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
 //There is one meeting room in a firm. There are N meetings in the form of (start[i],
        // end[i]) where start[i] is start time of meeting i and end[i] is finish time of meeting i.
        //What is the maximum number of meetings that can be accommodated in the meeting
        // room when only one meeting can be held in the meeting room at a particular time?
    }
    static class Item
    {
        int start;
        int end;
        public Item(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {

        //here we sort the array based on end time of meeting and then check if the start time of a meeting
        //is greater than end time of last meeting.
        Item array[]=new Item[n];
        for(int i=0;i<n;i++)
        {
            array[i]=new Item(start[i],end[i]);
        }

        Arrays.sort(array,(a,b) ->
        {
            if(a.end>b.end)
            {
                return 1;
            }
            else if(a.end<b.end)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        });

        int maxmeeting=1;

        int i=1;
        int j=0;
        while(i<n && j<n)
        {
            if(array[i].start>array[j].end)
            {
                maxmeeting++;
                j=i;
                i++;
            }
            else

            {
                i++;
            }

        }

        return maxmeeting;
    }











    {
        int start;
        int end;
        Item(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Item> array=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            array.add(new Item(start[i],end[i]));
        }
        Collections.sort(array,(a,b)->
        {
            if(a.end>b.end)
            {
                return 1;
            }
            else if(a.end<b.end)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        });
        int count=1;
        int endtime=array.get(0).end;
        for(int i=1;i<n;i++)
        {
            if(array.get(i).start>endtime)
            {
                count++;
                endtime=array.get(i).end;
            }

        }
        return count;
    }

}
