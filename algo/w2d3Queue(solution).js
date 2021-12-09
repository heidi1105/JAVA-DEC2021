class Stack{
	constructor(){
		this.items=[]
		this.capacity = 10
	}


	push(item){
		this.items.push(item)
	}
	pop(){
		return this.items.pop()
	}

	peek(){	
		return this.items[this.items.length-1]
	}

	size(){
		return this.items.length;
	}

	isEmpty(){
		if(this.items.length ==0){
			return true;
		}else{
			return false
		}
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
class Node{
	constructor(data){
		this.data = data;
		this.next = null;
	}
}

class SLLQueue{
	constructor(){
		this.front = null;
		this.rear = null;

	}

	compareQueue(q2){
		let isEqual = true;
	    let newq1 = new SLLQueue()
	    let newq2 = new SLLQueue()
	    // q1: a,b,c,d.  q2: a,b,c 
	    while(!this.isEmpty() || !q2.isEmpty()){
	      let temp = this.dequeue();
	      let temp2 = q2.dequeue();
	      if(temp != temp2){
	        console.log("false")
	        isEqual = false;
	      }
	        newq1.enqueue(temp);
	        newq2.enqueue(temp2); 
	      }
	     // the while loop will stop when one of the q ends

	    // q1 is not empty but q2 is empty 
	    if(!this.isEmpty() && q2.isEmpty()){
	        isEqual = false;
	      }

	    if(this.isEmpty() && !q2.isEmpty()){
	        isEqual = false;
	      }

	    
	    while(!newq1.isEmpty() && !newq2.isEmpty()){
	        let temp3 = newq1.dequeue()
	        this.enqueue(temp3)
	        let temp4 = newq2.dequeue()
	        q2.enqueue(temp4)
	      }
	    if(isEqual){
	      console.log("they are equal")
	    }else{
	      console.log("they are not equal")
	    }
		// compare this queue to another given queue to see if they are equal
		// do not use any extra array or objects
		// the queue should return to the original order when order
	}

	isPalindrome(){
		let isEqual = true;
	    let newStack = new Stack();
	    let newq2 = new SLLQueue()
	    // q1: a,b,c,d.  q2: a,b,c 
	    while(!this.isEmpty()){
	      let temp = this.dequeue();
	      newq2.enqueue(temp);
	      newStack.push(temp);

	    }
	    while(!newStack.isEmpty()){
	    	let stackItem = newStack.pop()
	    	let qItem = newq2.dequeue();
	    	this.enqueue(qItem);
		      if(stackItem != qItem){
		        isEqual = false;
		      }	    	
	    }
   
	    if(isEqual){
	      console.log("they are equal")
	    }else{
	      console.log("they are not equal")
	    }
		//Determine if the queue is a palindrome (same items forward and backwords)
		// Use only 1 stack as additional storage, no other arrays or objects
	}


	getFront(){
		if(this.front){
			return this.front.data;
		}else{
			return null;
		}
		//return the front
	}
    enqueue(data){
        // construct a new node and add to the current queue
        var node = new Node(data);
        if (this.front == null) {
          this.front = node;
          this.rear = node;
        } else {
          this.rear.next = node;
          this.rear = node;
        }
    }

	dequeue(){
		// remove and return from the front of the queue
	    if (!this.front) {
	      return null;
	    }

	    const dequeued = this.front;
	    this.front = this.front.next;

	    if (this.front === null) {
	      this.rear = null;
	    }
	    return dequeued.data;		
	}

	isEmpty(){
	    if(this.front){
	      return false;
	    }else{
	      return true;
	    }
		// check if the queue is empty
	}

	printQueue(){


		console.log("Front: " + this.getFront());
	    let q2 = new SLLQueue();
	    while(!this.isEmpty()){
	      let temp = this.dequeue();
	      console.log(temp);
	      q2.enqueue(temp)
	    }
	    while(!q2.isEmpty()){
	      this.enqueue(q2.dequeue())
    }

		
	}

	contains(searchVal) {
	    let runner = this.front;

	    while (runner) {
	      if (runner.searchVal === searchVal) return true;
	      runner = runner.next;
	    }
	    return false;
  	}
}


var q = new SLLQueue();
q.enqueue("a");
q.enqueue("b");
q.enqueue("b");
q.enqueue("a");
q.printQueue();

q.isPalindrome();



