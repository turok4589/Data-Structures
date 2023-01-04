//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]
//it should return 1

//given an array [2,3,4,5]
//return undefined


//naive approach
//nested for loop

//this technically doesn't work as intended. [2,5,5,2] will output 2 when it should output 5.
function firstrecurringcharacter(input){
    for(let i = 0; i < input.length; i++){
        //constantly compare characters
        //need to do i+1 so you don't compare the same index and make the function think its the same
        for(let j = i+1; j < input.length; j++){
            if(input[i] === input[j]){
                return input[i];
            }
        }
    }
    return lowestindex;
}

function firstrecurringcharacter2(input){
    //remember you should technically always check your input
    //use a hashtable poggers
    let map = {}; //keys are going to be unique
    for(let i = 0; i < input.length; i++){
        if(map[input[i]] !== undefined){
           return input[i];
        }
        map[input[i]] = i; //could also just change this to true, the problem is that because 2 is in 0 and in javascript that means false we have a problem
    }
   return undefined;
}

//this fixes the problem with the first function
//offset is essentially checking for the lowest index if something is found to be equal.
function firstRecurringCharacter3(input) {
    let found;
    let offset = input.length + 1;
    for (let i = 0; i < input.length; i++) {
        for (let j = i + 1; j < input.length; j++) {
            if (input[i] === input[j] && j < offset) {
                found = input[i];
                offset = j;
            }
        }
    }
    return found;
}

//only downside is that we increased the space complexity to O(n)
console.log(firstRecurringCharacter3([2,5,5,2,3,5,1,2,4]));