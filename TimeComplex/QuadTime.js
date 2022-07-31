//Log all pairs of array

const boxes = ['a', 'b', 'c', 'd', 'e'];
function logAllPairsOfArray(array) {
  for (let i = 0; i < array.length; i++) {
    for (let j = 0; j < array.length; j++) {
      console.log(array[i], array[j])
    }
  }
}

logAllPairsOfArray(boxes)

//This is a common interview question. To log all pairs of arrays
//Something seen in a lot of interviews
//Nested loops are a sign of multiplication
//O(n*n) = O(n^2) Quadratic Time
//a lot of interview questions require you to make this faster.