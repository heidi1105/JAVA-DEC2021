//// CLASS NODE /////////////////////////////////////
class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
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
   
    // **** Determines if the list is empty ****    
    isEmpty(){
      if (!this.head){
        console.log("Empty List");
        return true;
      }
      return false;
    }

    //Create a new node with the given value and inserts it at the back of the list
    insertAtBack(val){
        // instantiate the node with the val
        var d = new Node(val);
        // put the new val into the list       
        var runner = this.head;
        // Loop until runner.next = null
        while (runner.next) {      
          runner = runner.next
        }
        runner.next = d;

    }

    insertAtBackVersion2(val){
        // instantiate the node with the val
        var new_node = new Node(val)
        // put the new val into the list

        if (!this.head) {
          this.head = new_node;
        } else {
              var runner = this.head;
              while(runner.next){ // while(runner != null)
             runner = runner.next;  
              }            //  if (runner.next === null) {
               runner.next = new_node;
              //  break;
             }   
	}

    // **** Array to List ******************
    arrToList(arr){
        // loop through the array
        for (var i=0; i<arr.length; i++) {
          // add each value in array to back of SLL
          this.insertAtBack(arr[i]);
        }
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
    }
}

var list1 = new SLL();

// test is empty
console.log("Is list1 empty? " + list1.isEmpty());

list1.head = a;
// test is empty again

console.log("Is list1 empty? " + list1.isEmpty());
list1.printList();

console.log("\n**** Insert 4 at back ****\n")
list1.insertAtBack(4);

list1.printList();
// 1 , 2, 3 , 100, 200, 300
// list1.arrToList([100, 200 , 300])
// list1.printList();

console.log("\n***** Insert array *****");
list1.arrToList([5,6,7,8,9,10]);

list1.printList();