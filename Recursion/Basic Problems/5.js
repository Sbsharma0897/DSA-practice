

function sum(n,i)
{

    if(i==n.length-1)
    {
        return n[i]
    }

    return Number(n[i])+Number(sum(n,i+1))

}

console.log(sum("1342",0))