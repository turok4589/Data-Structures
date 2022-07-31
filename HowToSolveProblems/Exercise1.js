// Give 2 Arrays, create a function that let's a user know(true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];
//const array2 = ['z', 'y', 'i'];
//should return false
//---------------
//const array1 = ['a', 'b', 'c', 'x'];
//const array2 = ['z', 'y', 'x'];
//should return true

//2 Parameters
//return true or false
//start with the brute force method. Which is just two loops scanning through the array. Which is O(n^2)
//can you convert the first array into an object
//array ==> obj {
 //   a: true,
 //   b: true,
 //   c: true,
 //   x: true
//}

//array2[index] == obj.properties
//loop through second array and check if it has a matching property.
const array1 = ['a', 'b', 'c', 'x', 'a'];
const array2 = ['z', 'y', 'a'];
function containsCommonitem2(arr1, arr2){
    //loop through first array and create object where properties === items
    console.log(arr1);
    let map = {}; //{} is for objects, and [] is for arrays.
    //also could have said var map = {} to have function scope instead of block scope.
    //remember to access javascript objects it's objectname["PropertyName"]
    //or objectName.propertyName
    //but in this case since we are trying to mimic a hashmap we do brackets.
    for(let i = 0; i < arr1.length; i++){
        //check whether it exists, remember we don't want duplicates
        if(map[arr1[i]] != true){ //value returned by map[arr1[i] is a boolean]
            console.log(arr1[i]);
            const item = arr1[i];
            map[item] = true; //In this case the item is the key
            console.log(map[arr1[i]]);
        }
    }
    console.log(map);
    ////loop through second array and check if it has a matching property.
    //now we need to loop through the second array and check if it exists
    for(let i = 0; i < arr2.length; i++){ //written by yours truely
        console.log(map[arr2[i]]);
        if(map[arr2[i]] ===  true){
            return true;
        }
    }
  return false;
}

console.log('Output is: ' + containsCommonitem2(array1, array2));

//O(a+b)
//note this is the equivalant of a hashset in java
//https://github.com/nimrod46/Data-Structures-and-Algorithms/blob/master/src/interview_question/CommonItems.java
//now Step 11 is to error check
//how can yo break this code.
//Is there a way to improve this further.
//the downside to this solution is that only numbers, booleans, and strings will work.
//non-literal values will not work
//the code could also be a little more readable.
//I would google specific methods on arrays to see if I can clean up the code.

function containsCommonitem3(arr1, arr2){
    return arr1.some(item => arr2.includes(item))
}
//idk wtf this is. It's just some fancy javascript stuff.
//The brute force method had a space complexity of O(1). Nothing new being created except the i and j variables.
//But for this one we're making a new object and adding the items in the array into it.
//So space complexity of O(n)
//also in this solution this is more comparable to a hash map, but in java a hash set would be better.

console.log('Output is: ' + containsCommonitem3(array1, array2));

//test the javascript set object at a later date.


//This is Javascript's Version of Hashset. The previos example was more like a hashmap.
//Hash Set doesn't allow duplicate values, Hashmap doesn't allow duplicate keys
function containsCommonitem4(arr1, arr2){
    const mySet = new Set();
    const len = arr1.length;
    for(let i = 0; i < len; i++){
        if(arr1[i] != null){ //don't want null values
            mySet.add(arr1[i]); 
        }
    }
    for(let i = 0; i < arr2.length; i++){
        if(mySet.has(arr2[i])){ //hashset has good constant lookup time
            return true;
        }
    }
   return false;
}
//This also has O(a+b)
console.log('Output is: ' + containsCommonitem4(array1, array2));
