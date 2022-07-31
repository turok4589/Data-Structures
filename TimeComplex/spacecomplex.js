//#5 Space complexity O(1)
function boooo(n) {
    for (let i = 0; i < n; i++) {
        console.log('booooo');
    }
}
//Time Complex for this is O(N)
//But what is the space complexity
//there is only one variable created and we do not care how large the input is.
//think within the function are we adding any space.
//so space complexity O(1)


// #6 Space complexity O(n)
function arrayOfHiNTimes(n) {
    var hiArray = [];
    for (let i = 0; i < n; i++) {
        hiArray[i] = 'hi';
    }
    return hiArray;
}

//Remember the cheat sheet
//Created an array aka a variable
//We ignore the constant time(let i = 0)
//We also created an array a data structure. Fill the array with n loops
//Each item is an additional memory space on our computers n times.
//So the space complexity is O(n)

arrayOfHiNTimes(6)

//heap is where we store variables
//stack is where we keep track of function calls