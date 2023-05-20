function findDigits(n) {
    // Write your code here
let count = 0;
let digits = Array.from(String(n), Number);
console.log("arr: "+ digits);
for(let i =0; i<digits.length; i++){
    if (n%digits[i]==0){
        count++;
    }
    
}
return count;
}