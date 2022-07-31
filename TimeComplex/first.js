const nemo = ['nemo'];

function findNemo(array){
    for(let i = 0; i < array.length; i++){
        if(array[i] === 'nemo'){    //technically this is also an operation that's checked n times
            console.log('Found Nemo!');
        }
    }
    //This function scans through the entire array so it's linear time. Number of inputs increase so do the operations.
    //So it's O(N) --> Linear Time, it takes linear time to find nemo
    //Technically this has a time complexity of O(2n)
}

findNemo(nemo);
//Three equal signs require same data type and value javascript
//In this course we will learn and code first in javascript and then learn how to do it in java and python.
//How can we measure the bigO(N)
//We need to figure out how many operations the computer performs.
//remember javascript has break and this makes the code more efficient 
//however the worst case is still O(N)