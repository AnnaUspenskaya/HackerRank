// An integer d  is a divisor of an integer n if the remainder of n/d=0.

// Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

// Example:
// n = 124
// Check whether 1, 2 and  4 are divisors of 124. All 3 numbers divide evenly into  124 so return 3.
// n = 111
// Check whether 1, 1, and 1 are divisors of 111. All 3 numbers divide evenly into  111 so return 3.
// n = 10 
// Check whether  1 and 0 are divisors of 10. 1 is, but 0 is not. Return 1.
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