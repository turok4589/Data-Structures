function reverse(str){
    //reversing a string
    var rev = "";
    for(let i = str.length - 1; i >= 0; i--){
        //rev = rev + str.charAt(i);
        rev = rev + str[i];
    }
   return rev;
}

function reverse2(str){
    //check input we can't just assume we always get a string
    if(!str || str.length < 2 || typeof str !== 'string'){ //undefined string or only recieved a string with 1 letter, or didn't recieve a string.
        return "Hmm that's not good"
    }
    //undefinied simply means that it was only declared. In javascript it doesn't know the type of something until it is given a value.
    const backwards = [];
    const length =  str.length - 1;
    for(let i = length; i >= 0; i--){
        backwards.push(str[i]);
        //javascript has str.split, or we can just use strings as arrays kappa.
    }
    console.log(backwards);
    return backwards.toString(); //could also do the to join method
}

function reverse3(str){
    return str.split('').reverse().join(''); //build in javascript array method, at the end we convert it back to a string with the join method.
}

const reverse4 =  str => str.split('').reverse().join('');

console.log("Hi");
console.log(reverse("Huge"));
console.log(reverse2("Hi my name is andrew"));