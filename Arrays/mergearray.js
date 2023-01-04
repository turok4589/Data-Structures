//We need to merge two sorted arrays.
//This solution works with the leetcode one just it would be O(n) space complexity.
//Time Complexity O(n)
//Then since the answer so be inside of, we could copy the array into it. (Technically making n+m+z) which is still considered O(n) time
function mergearray(a1, a2){
   const a3 = [];
   //Arrays are sorted but can be of different sizes so going to need two loops.
   let length1 = 0;
   let length2 = 0;
   let i = 0;
   while(length1 <= a1.length - 1 && length2 <= a2.length - 1){
       if(a1[length1] < a2[length2]){
           a3[i] = a1[length1];
           i++;
           length1++;
       }
       else{
          a3[i] = a2[length2];
          i++;
          length2++;
       }
   }
   //now we need to check if length <  the length of the original arrays
   if(length1 < a1.length){
      while(length1 <= a1.length - 1){
          a3[i] = a1[length1];
          i++;
          length1++;
      }
   }
   else{
      while(length2 <= a2.length - 1){
         a3[i] = a2[length2];
         i++;
         length2++;
      }
   }
   return a3;
}

/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
 var merge = function(nums1, m, nums2, n) {
    //last index of nums 1
    last = m + n - 1;
    //merge in the reverse order as these are sorted arrays so we can assume the greatest values are going to     
    //be at the end of both arrays.
    while(m > 0 && n > 0){
        if(nums1[m - 1] > nums2[n - 1]){
           nums1[last] = nums1[m - 1];
           m -= 1;
        }
        else{
            nums1[last] = nums2[n-1];
            n -=1;
        }
        last -= 1;
    }
    //fill nums1 with leftover nums2 elements
    while(n > 0){
        nums1[last] = nums2[n-1];
        n = n-1;
        last = last - 1;
    }
    return nums1;
};

function mergearray3(a1, a2){
    const mergearray = [];
    let array1item = a1[0];
    let array2item = a2[0];
    let i = 1;
    let j = 1;
    //check the input
    if(a1.length === 0){
        return a2;
    }
    if(a2.length === 0){
        return a1;
    }
    while(array1item || array2item){
        //while we have things in the arrays
        console.log(array1item, array2item);
        console.log(i, j);
        if(j > a2.length || array1item < array2item){
            mergearray.push(array1item);
            array1item = a1[i];
            i++;
        }
        else{
            mergearray.push(array2item);
            array2item = a2[j];
            j++;
            //needs to a2[a2.length - 1] to be undefined
            //so then j > a2.length
            // j > a2.length - 1 causes an infinte loop because of the way he has it set up
        }
    }
    //this code is overcomplicated
    //the !array2item is to check when array2item becomes undefined so it just adds the rest into it.
    //undefined < 6 = false so thats why u don't need to check if array1item went undefined
    //This solution is very specific to the way javascript handles arrays
    return mergearray;
}

//optomized so
const a1 = [1, 2, 2, 3, 4, 5];
const a2 = [6, 7, 8, 9, 10, 11];

const a3 = mergearray(a1, a2);

console.log(a3);
console.log("The size of the array is " + a3.length.toString());
console.log(mergearray3(a1,a2));


//[1,2,3], [4,5,6,0,0,0]