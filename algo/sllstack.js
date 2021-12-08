
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class slStack {
    constructor() {
        this.top = null; 
    }

    // add to top
    push(newNode) {
        if (this.top === null) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    // remove from top
    pop() {
        if (this.top === null) return null;

        var removed = this.top; // store previous top
        this.top = this.top.next; // move top pointer (or = removed.next)
        removed.next = null; // remove pointer from stored node
        return removed; // return the node
    }

    // aka check top
    peek() {
        return this.top;
    }

    // check if empty
    isEmpty() {
        return this.top === null;
    }

    // "1" == 1 true
    // "1" === 1 false

    // length getter
    getLength() {
        return this.length;
    }
}


let stack = new slStack()
let a = new Node(1);
let b = new Node(2);
let c = new Node(3);
stack.push(a);
stack.push(b);
stack.push(c);





