class Node {
    constructor(val) {
        this.val = val
        this.next = null
    }
}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 


class SLL {
    constructor() {
            this.head = null;
        }
    
    //Determines if the list is empty ***    
    isEmpty(){
    }

    //Create a new node with the given value and inserts it at the back of the list
    insertAtBack(val){
        // instantiate the node with the val
        // put the new node into the list
        // 1  -->  2  -->  3 --> null 
        // 1  -->  2  -->  3 --> 4    --> null
    }
    arrToList(arr){
        //BONUS: Add all the items of an array to the back of the list
    }

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
        // 1  -->  2  -->  3 --> null 
        //1 --> 2 --> 3--> 4 --> null
    }

}

var list1 = new SLL();
list1.head = a;
list1.printList();
// 1 , 2, 3 , 100, 200, 300
// list1.arrToList([100, 200 , 300])
// list1.printList();