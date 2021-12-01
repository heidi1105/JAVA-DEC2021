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

    // ------------------------------------- Week 1 Day 2 algo -------------------------------------------
 
    isEmpty(){
        //Determines if the list is empty ***   
    }


    insertAtBack(val){
        // Create a new node with the given value and inserts it at the back of the list
        // HINT: How to find the last node of a Singly Linked List?

    }

    // bonus questions 
    arrToList(arr){
        //Add all the items of an array to the back of the list
    }

    //given
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
    // ------------------------------------- END OF Week 1 Day 2 algo -------------------------------------------

}

// Constructing nodes connecting each other with .next
var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 

// Constructing a Singly Linked List with the above nodes 
var list1 = new SLL();
list1.head = a;
list1.printList();
// list1: (1) --> (2) --> (3) --> NULL
//       HEAD



// Test case for arrToList: 
// list1.arrToList([8, 9 , 10])
// list1.printList();
// expected outcome: (1) --> (2) --> (3) --> (8) --> (9) --> (10) --> null





