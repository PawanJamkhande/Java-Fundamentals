/*
TypeScript : 
Datatype 
1) Any Type - it is dynamic type that bypass data types 
2) Built in types - boolean , null, number, string, undefined , void
3) 
*/

// let x:number=10;
// let y:number=35;
// console.log(x+y)

// let m:string="Hello, Welcome to the TypeScript";
// console.log(m)

let isTrue:boolean=true;
let emptyValue:null=null;
let num:number=109;
let str:string="Hello bachhooonn!!";
let uninitializedvar:undefined=undefined;

function logMessage():void{
    console.log("This function doesn't return anythin.");
}

console.log(isTrue);
console.log(emptyValue);
console.log(num);
console.log(str);
console.log(uninitializedvar);

//ENUM usecase 
enum colors{
    black,
    blue,
    white,
    green
}

let c:colors=colors.white;
console.log(c)
