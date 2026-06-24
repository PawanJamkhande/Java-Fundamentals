//Division by Zero

let a=10;
let b=0;
try{

    if(b==0){
        throw "Can not divide by zero"
    }
let result=a/b;
console.log(result)
}

catch(error){
    console.log(error)
}

let balance=2000;

let wa=5000;

try{

    if(wa>balance){
        throw "OOPS!!Insufficient Balance"
    }
    balance-=wa;
    console.log("current balance is:"+balance)
}catch(error){
    console.log(error)
}



//array index

let students=["maya","abi","priya","anjali"]

let index=6;
try{
    if(index>=students.length){
        throw "Index out of Range value not available"
    }
    console.log(students[index])
}catch(error){
    console.log(error)
}

//Multiple catch does not support javascript but we can handle multiple condition


let cb=10000;

let wamount=12000;

try{

    if(wamount<0){
        throw "Invalid amount"
    }
    if(wamount>cb){

        throw "Insuuficent balance"
    }
    cb-=wamount;
    console.log("After transaction balance is:"+cb)
}catch(error){
    console.log(error)
}