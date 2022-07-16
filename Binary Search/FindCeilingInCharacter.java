public class FindCeilingInCharacter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
       if(target>=letters[letters.length-1] )
       {
           return letters[0];
       }
       if(target<letters[0])
       {
           return letters[0];
       }
       int i=0;
       int j=letters.length-1;
       int ans=-1;

       while(i<=j)
       {
           int mid=(i+j)/2;
           if(letters[mid]==target)
           {
              i=mid+1;
           }
           else if(letters[mid]>target)
           {
               ans=mid;
               j=mid-1;
           }
           else
           {
               i=mid+1;
           }
       }
       return letters[ans];
    }
}
