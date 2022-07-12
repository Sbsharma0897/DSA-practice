
function reverse(n,sum)
{
   
   if(n==0)
   {

      return sum
   }
   var rem=n%10
   sum=sum*10+rem
   
   
   return reverse(Math.floor(n/10),sum)

}

var sum=0
console.log(reverse(1234,sum))