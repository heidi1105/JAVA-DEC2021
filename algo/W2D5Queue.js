
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLLStack {
    constructor() {
        this.top = null; 
    }
    // add to top
    push(data) {
      let pushed = new Node(data);
        if (this.top === null) {
            this.top = pushed;
        } else {
            pushed.next = this.top;
            this.top = pushed;
        }
    }

    pop() {
        if (this.top === null) return null;
        var removed = this.top; 
        this.top = this.top.next; 
        removed.next = null; 
        return removed.data;
    }

    // peek() {
    //     return this.top.data;
    // }

    isSLLEmpty() {
      if(!this.top){
        return true
      }else{
        return false
      }
    }

    printStack(){
      let tempStack = new SLLStack();
      let temp;
      console.log("Top: "+ this.peek());
      while(!this.isSLLEmpty()){
        temp = this.pop()
        console.log(temp);
        tempStack.push(temp);
      }
      while(!tempStack.isSLLEmpty()){
        temp = tempStack.pop();
        this.push(temp);
      }
    }
    
    
      // Method: remove the node with minimum value from the this stack
    minStack(){
      let minValue = 1000000;
      let copyStack = new SLLStack();
      
      // find the min in the original stack
      while (!this.isSLLEmpty()) {
        let currentValue = this.pop();
        if (currentValue < minValue) {
          minValue = currentValue;
        }
        copyStack.push(currentValue);
      }

      // rebuild original stack without the min value
      while (!copyStack.isSLLEmpty()) {
        let currentValue = copyStack.pop();
        if (minValue != currentValue) {
          this.push(currentValue);
        }
      }
    }
    
    

}


class SLLQueue{
	constructor(){
		this.front = null;   
		this.rear = null;
	}                          

  sumOfHalvesEqual(){ //OMG IT WORKS 
    // create a method and return whether the first half of the queue is equal to the sum of the second half
    //new temp queues
    let tempq1 = new SLLQueue()
    let tempq2 = new SLLQueue()
    let counter= 0
    let sum1=0
    let sum2=0
    //need to keep track of how many "counter"
     //enqueue to temp queues so we dont lose
    while(!this.isEmpty()){
      let temp = this.dequeue()
      tempq1.enqueue(temp)
      counter++
    }

    
    if(counter % 2==1){
      console.log("this list does not have two equal halves");
      return false;
    } else {
      let limit = counter/2
      
      // get sum of first half


    }  
      while(limit>0){
        let temp=tempq1.dequeue();
        sum1 += temp
        limit--;
        this.enqueue(temp)
      }

      while(!tempq1.isEmpty()){
        let temp=tempq1.dequeue()
        sum2 += temp 
        this.enqueue(temp) 
       }    
    
    
    if (sum1==sum2){
      console.log("these two halves are equal")
      return true
    }
    else{
      console.log("these halves are not equal")
      return false 
    }
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

/////// MAIN EXECUTION SECTION ///////////////
var stack1 = new SLLStack()
stack1.printStack()
stack1.push(1);
stack1.push(2);
stack1.push(3);
stack1.push(4);
stack1.push(5);
stack1.minStack()
//sorry Val I deleted your stack...
//console.log("**** Make a new stack and push 1 to 5 ****");
console.log("**** Remove Min ****");
stack1.printStack()


let q = new SLLQueue();

// q.enqueue(2);
// q.enqueue(3);
// q.enqueue(1);
// q.enqueue(1);
// q.enqueue(3);
// q.enqueue(2);
// q.printQueue()

// let q2 = new SLLQueue();

// q2.enqueue(5);
// q2.enqueue(3);
// q2.enqueue(1);
// q2.enqueue(1);
// q2.enqueue(3);
// q2.enqueue(2);
// q2.printQueue()



// q.sumOfHalvesEqual();
// q2.sumOfHalvesEqual();