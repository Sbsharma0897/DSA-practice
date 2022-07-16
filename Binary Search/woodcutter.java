public class woodcutter {
    public static void main(String[] args) {
//Lumberjack Bob needs to chop down M metres of wood. However, Bob is only allowed to cut a single row of trees.
//
//Bob's machine works as follows: Bob sets a height parameter H (in metres), and the machine raises a giant sawblade to that height and cuts off all tree parts higher than H (of course, trees not higher than H meters remain intact). Bob then takes the parts that were cut off.
//
//For example, if the tree row contains trees with heights of 20, 15, 10, and 17 metres, and Bob raises his sawblade to 15 metres, the remaining tree heights after cutting will be 15, 15, 10, and 15 metres, respectively, while Bob will take 5 metres off the first tree and 2 metres off the fourth tree (7 metres of wood in total).
        //4 7
        //20 15 10 17
    }
    function solve(array,N,M,i,j)
    {
        var ans=-1;
        //console.log(array,N,M,i,j)
        while(i<=j)
        {

            var mid=Math.floor((i+j)/2)
            var sum=findsum(array,N,M,mid)

            if(sum==M)
            {

                return mid;
            }
            else if(sum>M)
            {
                ans=mid;

                i=mid+1;
            }
            else
            {
                //console.log(sum,"dd")
                j=mid-1;
            }
            //console.log(ans,"ans")
        }
        return ans;

    }
    function findsum(array,N,M,mid)
    {
        var sum=0;
        for(var i=0;i<N;i++)
        {
            if(array[i]<=mid)
            {
                continue;
            }
            else
            {
                sum=sum+(array[i]-mid)
            }
        }
        //console.log(sum,mid)
        return sum;
    }

    function runProgram(input) {
        input=input.trim().split('\n');

        var [N,M]=input[0].trim().split(" ").map(Number);
        var array=input[1].trim().split(" ").map(Number);

        array.sort(function(a,b)
        {
            return a-b;
        })
        var i=0;
        var j=array[array.length-1];

        console.log(solve(array,N,M,i,j))
    }
}
