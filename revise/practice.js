let str = "abc";
let  reversed = str.split("").reverse().join("");

if (reversed === str){
    console.log("is  palindrome")
}
else {
    console.log("not  a palindrome");
    
}

let num1 =1;
let num2= 21;
let operator = "-"

switch(operator){
    case "+" :
       console.log(num1 + num2);
       break;
    case "-" :
        console.log(num1 - num2);
         break;
    case "*" :
       console.log(num1 * num2);
       break;
    default :
      console.log(" invalid  operator");
      
       
}

let  string = "sania"
let  reverse = string.split("").reverse().join("")
console.log(reverse);
