
function print(n)
{
   
    
    if(n==20)
    {
        return 20
    }
    return n+print(n+1)
    
}

console.log(print(10)) 