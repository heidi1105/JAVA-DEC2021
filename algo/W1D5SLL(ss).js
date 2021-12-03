class Node {
    constructor(val) {
        this.val = val
        this.next = null
    }
}

class SLL {
    constructor() {
            this.head = null;
        }

    // ----------- Week 1 Day 5 algo ------------
    
    secondToLast(){
        //return the value of the second to last node in the list.
    }
 
    removeVal(val){
        //Remove the node that has the matching given value
        //HINT: The list is constructed by connecting nodes with pointers
        // Play with the pointers so that you can remove that node from the list. 
    }

    prepend(newVal, targetVal){
        //Insert a new node before a node that has the given target value
    }

    // My personal favourite on SLL
    hasLoop(){
        //determine whether this SLL has a loop
    }
    // ------------ END OF Week 1 Day 5 algo ------------

    printList(){
        if(!this.head){
            console.log("Empty list");
            return
        }
        var runner = this.head;
        while(runner){ // while(runner != null)
            console.log(runner.val);
            runner = runner.next;            
        }
    }

}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 
var list1 = new SLL();
list1.head = a;
list1.printList();
// list1: (1) --> (2) --> (3) --> null

