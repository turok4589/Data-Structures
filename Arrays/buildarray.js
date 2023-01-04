//We are going to learn how to build an array, more specifically an arraylist.
//Arrays in javascript are just objects with integer based keys.
class MyArray{
    constructor(){
        this.length = 0;
        this.data = {}; //This is gonna be an object.
    }

    get(index){
        return this.data[index]; ////remember to access javascript objects it's objectname["PropertyName"]
    }

    push(item){
        this.data[this.length] =  item; //saying propertyname 0 equals item. Javascript objects are name:value pairs. Essentially its creating a new property, java can't do this.
        this.length++;
        return this.length;
    }
    pop(){
        const popped = this.data[this.length-1];
        delete this.data[this.length-1]; //unique to javascript
        this.length--;
        return popped;
    }

    delete(index){
        const item = this.data[index];
        //delete the item and then shift all the data.
        //functions should have a single responsible so create a new function.
        this.shiftItems(index);
        return item; //return the deleted item
    }

    shiftItems(index){
        for(let i = index; i < this.length - 1; i++){
            this.data[index] = this.data[i+1];
        }
        //the index we gave it for the delete gets replaced.
        //issue: the last item in the array is copied.
        delete this.data[this.length - 1];
        length--;
    }
}

const newArray = new MyArray(); //use new keyword to instantiate. 
newArray.push('hi');
newArray.push('you');
newArray.push('you');
newArray.pop();
console.log(newArray);

//output MyArray { length: 1, data: { '0': 'hi' } }