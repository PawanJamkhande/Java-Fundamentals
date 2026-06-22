//1.Reverse string

let str="JavaScript"

console.log("String is:"+str)
//["J","a","v","a","S"]
//"t","p","i","C"
//split convert string into specific array character
let reverse=str.split("").reverse().join("")
console.log("Reverse String is:"+reverse)

//2.palindrome

let word="madam"

let x=word.split("").reverse().join("")

if(word===x){
    console.log("String is Plaindrome")
}

else{
    console.log("string is not palindrome")
}


//3. Count vowels

let s1="JavaScript";

let count=0;

for(let i of s1){
    if("aeiou".includes(i))
    {
        count++;
    }
}

console.log(count)

//4.count words

let msg="Ran in Mumbai"

let cw=msg.split(" ")

console.log(`Total word are:${cw.length}`)

let msg1="   Javascript is scripting language    "

console.log("Main String:"+msg1)

console.log("After remove space:"+msg1.trim())
//capitalize first caharcter
let email="sam@gmail.com";

console.log(email)

let result=email.charAt(0).toUpperCase()+ email.slice(1);

console.log(result)