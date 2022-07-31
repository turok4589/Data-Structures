const boxes = [0, 1, 2, 3, 4, 5];

function logFirstTwoBoxes(boxes){
    console.log(boxes[0]); //We have one operation here O(1)
    console.log(boxes[1]); //And again O(1)
    //Each time this function runs two operations
}

logFirstTwoBoxes(boxes); //O(2) Operations every time
//This is still considered O(1) as it's constant time.

//O(1) is constant time, no matter the input this is only running once.