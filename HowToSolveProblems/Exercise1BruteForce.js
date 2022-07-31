function containsCommonitem(arr1, arr2){
    for(let i = 0; i < arr1.length; i++){
        for(let j = 0; j < arr2.length; j++){
            if(arr1[i] === arr2[j]){
                return true;
            }
            }
        }
       return false;
    }
const array1 = ['a', 'b', 'c', 'x'];
const array2 = ['z', 'y', 'x'];
console.log(containsCommonitem(array1, array2));

//This is O(a*b). Very brute force approach
//rememeber different terms for inputs
//Why is this approach not the best
//Two foor loops. One nested and we know that we have a big O(a*b)
//Two nested for loops can be a sign to use hash tables.