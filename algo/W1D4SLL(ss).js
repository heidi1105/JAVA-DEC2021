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

    // ----------- Week 1 Day 4 algo ------------
    

    contains(val){
        //Determines whether or not the given search value exists in this list.
        //return a boolean
    }

    containsRecrusive(val, curr = this.head){
        // Determines the number of nodes that the given search value exists in this list.
        // i.e. val = 10, 
        //(10) --> (2) --> (10) --> (10) --> null 
        // This should return 3
    }

    removeBack(){
        //remove the last node of a SLL
    }
 
    // ------------ END OF Week 1 Day 4 algo ------------

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

