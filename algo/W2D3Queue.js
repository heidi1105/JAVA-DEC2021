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
		// compare this queue to another given queue to see if they are equal
		// do not use any extra array or objects
		// the queue should return to the original order when order
	}

	isPalindron(){
		//Determine if the queue is a palindrom (same items forward and backwords)
		// Use only 1 stack as additional storage, no other arrays or objects
	}


	front(){
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
q.enqueue("c");
q.enqueue("d");
q.printQueue();

q.dequeue();
q.printQueue();


