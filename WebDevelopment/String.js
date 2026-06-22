/*
String in java script 
*/ 

let name="sam dao";

console.log(name);

// Template literal

console.log("Name:"+name)

console.log(`Hello, My name is : ${name} `)

console.log(`Length of string:${name.length}`);

//access string

let city="Hydrabad";

console.log(city[0])

console.log(city[6])
//slice- returning string parts 
//slice(startindex,endindex)
console.log(city.slice(0,5));

console.log(city.substring(2,6))

let cname="Java Full Stack"

console.log(cname)
//replace-(search value,replace value)
console.log(cname.replace("Java","python"))

//split- divide the string
let language="c, c++, java, python";
console.log(language.split(","))

let fullname="Sam Dao"

console.log(fullname);

console.log(fullname.split(" "))

console.log(fullname.indexOf("Dao"))

console.log(fullname.includes("dao",4))

let fName="Jhon"
let lname="smith"

console.log(fName+lname)
//String is immutable-we cant update string value
fName[0]="s"

console.log(fName)