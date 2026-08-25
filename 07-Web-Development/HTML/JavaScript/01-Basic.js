let x;
var y=null;
var y = 12;
console.log(typeof(x));
console.log(typeof(y));

const obj={
    name:"shiva",
    age:21
}
console.log(obj.name);
console.log(obj.age);
let sum=12;
let som="shiva";
console.log(sum==som);
console.log(Number(som));


let name =obj.age>10? "eligible":"not eligible";
console.log(typeof(NaN));

for(let i in obj){
    console.log(obj[i]);
}
fun = (a,b)=>{
    console.log(a+b);
}

funy=(a,b)=>{
    return a+b;
}
console.log((funy(2,5)));

const arr =["shiva",21,"CSE"];
arr.push("kumar");
arr.unshift("kumar");
console.log(arr.shift("kumar"));
console.log(arr.pop());
for(let i of arr){
    console.log(i);
}