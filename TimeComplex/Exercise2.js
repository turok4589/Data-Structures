// What is the Big O of the below function? (Hint, you may want to go line by line)
function anotherFunChallenge(input) {
    let a = 5; //O(1)
    let b = 10; //O(1)
    let c = 50; //O(1)
    for (let i = 0; i < input; i++) {   //O(n)
      let x = i + 1;  //O(n)
      let y = i + 2;  //O(n)
      let z = i + 3;v  //O(n)
  
    }
    for (let j = 0; j < input; j++) { //O(n)
      let p = j * 2; //O(n)
      let q = j * 2; //O(n)
    } 
    let whoAmI = "I don't know"; //O(1)
  }

  // 7n + 4
  // in the video he doesn't include the loops but he mentions that we can if we want.
  //at the end of the day it's still linear time so O(n)