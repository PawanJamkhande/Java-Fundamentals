"use strict";
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
let isTrue = true;
let emptyValue = null;
let num = 109;
let str = "Hello bachhooonn!!";
let uninitializedvar = undefined;
function logMessage() {
    console.log("This function doesn't return anythin.");
}
console.log(isTrue);
console.log(emptyValue);
console.log(num);
console.log(str);
console.log(uninitializedvar);
//ENUM usecase 
var colors;
(function (colors) {
    colors[colors["black"] = 0] = "black";
    colors[colors["blue"] = 1] = "blue";
    colors[colors["white"] = 2] = "white";
    colors[colors["green"] = 3] = "green";
})(colors || (colors = {}));
let c = colors.white;
console.log(c);
// normal array declaration
let arr = [1, 2, 3, 4, 5, 6];
console.log(arr);
let person = ["sam", 23, "Taloja", 410208, "Acc balance: ", 80.88];
console.log(person);
//Generic type declaration
let emp = ["sam", "john", "snow"];
console.log(emp);
//add array element 
emp.push("Raman");
console.log(emp);
emp.pop();
console.log(emp);
let p1 = {
    postId: 101,
    postName: "Java is secure",
    postpublished: true
};
console.log(p1);
function disp() {
    console.log("This is Typescript function");
}
disp();
function add(a, b) {
    return (a + b);
}
console.log(add(10, 5));
//optional function
function greet(name, age, weight) {
    console.log(name + " " + age + " " + weight);
}
greet("sam", 24);
// const num= (x:number):
// number =>{
//     return x*x;
// }
// console.log(10)
const info = (name) => {
    return "Name:" + name;
};
console.log(info("sam Dao"));
let result = (i) => {
    return i;
};
console.log(result(100));
