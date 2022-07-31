function compressBoxesTwice(boxes, boxes2){
    boxes.forEach(function(boxes){
      console.log(boxes);
    });
}

boxes2.forEach(function(boxes){
    console.log(boxes);
});

//for each is a method that calls a function
//he could have seperated it into a seperate function but in js it can be done like this. This is known as a function expression
//This depends on two different inputs so we need different terms for those inputs
//Thus the answer is O(a + b) or O(n+m) terms need to be different for each input
//If they used the same inputs it would be O(n)