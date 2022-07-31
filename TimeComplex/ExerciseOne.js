// What is the Big O of the below function? (Hint, you may want to go line by line)
function funChallenge(input) {
    let a = 10; //one operation O(1)
    a = 50 + 3; //another operations O(1)
  
    for (let i = 0; i < input.length; i++) { //O(n) The loop is ran n times. Runs depending on how large the input is
      anotherFunction();   //O(n)
      let stranger = true; //O(n)
      a++; //O(n)
    }
    //this scans through the everything in the array every time to it's in linear time O(n)
    return a; //O(1)
  }

  //So this functions added up is 4n + 3

  funChallenge();

  //a lot people interpret time complexity differently. Some people don't think assignments count towards BigO(N)'
  //at the end of the day this is still just O(n)