function printFirstItemThenFirstHalfThenSayHi100Times(items){
    console.log(items[0]); // O(1)

    var middleIndex = Math.floor(items.length / 2); //O(1)
    var index = 0; //O(1)

    while(index < middleIndex){   //first half will be printed out n/2
        console.log(items[index]);
        index++; //technically this is n/2 as well but he chose to ignore it
    }

    for(var i = 0; i < 100; i++){ //O(100)
        console.log('hi');
    }
}

//key difference between var and let are the scopes
//let has block scope(within in the brackets)
//var has function scope
//In the grand scheme of the things it's still O(n)