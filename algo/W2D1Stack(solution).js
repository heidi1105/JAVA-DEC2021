class Stack{
	constructor(){
		this.items=[]
		this.capacity = 10
	}

	push(item){
		//add an item at the top
		this.items.push(item)
	}



	pop(){
		//remove the top/last item from the stack 
		//return the removed item
		return this.items.pop()
	}

	peek(){
		// return the top item without removing it
		return this.items[this.items.length-1]
	}

	size(){
		return this.items.length;
		//return the size of the stack
	}

	isEmpty(){
		if(this.items){
			return true;
		}else{
			return false
		}
		// check if the stack is empty
	}

	isFull(){
		if(this.size() >= this.capacity){
			return false
		}else{
			return true;
		}
 	}

	printStack(){
		console.log("TOP");
		for(var i=this.items.length-1; i >= 0; i--){
			console.log(this.items[i])
		}
	}
}

var stack1 = new Stack()
stack1.push(1);
stack1.push(2);
stack1.push(3);
stack1.push(4);
stack1.push(5);
stack1.printStack()
stack1.pop();
stack1.printStack()
console.log(stack1.peek())