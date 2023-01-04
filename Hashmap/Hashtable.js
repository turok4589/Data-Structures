class HashTable{
    constructor(size){
        this.data = new Array(size);
    }

    _hash(key){
        let hash = 0;
        for(let i = 0; i < key.length; i++){
            hash = (hash + key.charCodeAt(i) * i) % this.data.length;
        }
        return hash;
    }

    //The underscore is javascript is for private properties.
    //Technically it doesn't have a real function, but it's just a standard that most javascript developers follow.
    //This still works with integers.
    //The charcode at returns an integer between 0 and 65535 depending on the ASCII

    set(key, value){
        let x = this._hash(key);
        if(this.data[x] === undefined){ //this checks if something is in the array index
            this.data[x] = []; //In this case we use an array instead, but traditionally its done with a linked list.
        }
        //now what happens if it already exists
        else if(this.data[x] != undefined){
            let temp2 = this.data[x];
            for(let i = 0; i < temp2.length; i++){
                if(temp2[i][0] === key){
                    //found our key
                    this.data[x][i][1] = value; //replace the value inside
                    return this.data;
                }
            }
        }
       this.data[x].push([key, value])
       return this.data;
    }

    get(key){
        let x = this._hash(key);
        //we store the information in a bucket.
        const currentbucket = this.data[x];
        console.log(currentbucket)
        if(currentbucket.length){
            //if currentbucket has something
            //We add an array to each slot when we add something.
            for(let i = 0; i < currentbucket.length; i++){
                if(currentbucket[i][0] === key){
                    //this is a bit weird but basically you store the key and value as an array each time.
                    //so an array slot holds a list of arrays and the 0 index holds the key.
                    return currentbucket[i][1]; //return the value
                } 
            }
        }
       return undefined
    }

    keys(){  //lowkey kinda garbage is he's only grabbing the first key in every index. "Not really dealing with collision again"
        //loop through all the keys of our hash table
        const keysArray = []; 
        for(let i = 0; i < this.data.length; i++){
            //loop through all 50 item spaces
            if(this.data[i] != undefined){
                //now we need to loop through this
                keysArray.push(this.data[i][0][0]); //grab the array
            }
        }
       return keysArray;
    }

    keys2(){
        if(this.data.length == 0){
            return undefined;
        }
        let result = [];
        //loop through all the elements
        for(let i = 0; i < this.data.length; i++){
            //if it's not an empty memory cell
            if(this.data[i] && this.data[i].length){
                //loop through all potential collision
                if(this.data[i].length > 1){
                    for(let j = 0; j < this.data[i].length; j++){
                        result.push(this.data[i][j][0]); //much better now you deal with collision as loop through each index of the subarray.
                    }
                }
                else{
                    result.push(this.data[i][0][0]); //this is the case if only one time is in the subarray
                }
            }
        }
       return result;
    }

}

const myHashTable = new HashTable(50);
let x = 50;
myHashTable.set('grapes', 1000);
myHashTable.set('grapes', 20);
myHashTable.set('apples', 50);
myHashTable.set('orange', 320);
myHashTable.set('orange', 330);
console.log(myHashTable.get('grapes'));
console.log(myHashTable.get('orange'));
console.log("keys: " + myHashTable.keys2());