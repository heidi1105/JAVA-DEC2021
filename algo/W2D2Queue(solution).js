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

	front(){
		return this.front ? this.front.data : null;
		//return the front
	}
	enqueue(data){
		const newRear = new Node(data);

	    if (this.isEmpty()) {
	      this.front = newRear;
	      this.rear = newRear;
	    } else {
	      this.rear.next = newRear;
	      this.rear = newRear;
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
		console.log("Front: " + this.front.data);
		var runner = this.front;
		while(runner){
			console.log(runner.data)
			runner= runner.next;
		}
		console.log("Rear: " +this.rear.data);
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


