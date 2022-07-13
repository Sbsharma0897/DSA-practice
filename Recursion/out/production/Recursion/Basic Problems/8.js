  //count zero

  function counter(n,count)
  {
    
    if(n==0)
    {
    return count
    }

    var rem=n%10
    if(rem==0)
    {
        return counter(Math.floor(n/10),++count)
    }
    return counter(Math.floor(n/10),count)
    

  }

  var n=43400343400
  var count=0
  console.log(counter(n,count))