 
 function palin(number,s,e)
 {
    if(s>=e)
    {
      return true
    }

    else if(number[s]==number[e])
    {
        return palin(number,s+1,e-1)
    }
    else 
    {
        return false
    }

 
 }
 var number="123321"
 
 var s=0
 var e=number.length-1
 
 console.log(palin(number,s,e))