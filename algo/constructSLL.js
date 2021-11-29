//Data type

//integer
// array
//String 
// dictionary / object
// boolean


//var arr = [ 1,3,6,2,6,8] 

// array vs SLL (Why?)
// Object/ dict --> key & val pair
// how to construct the node
// how to construct the list



class Node {
    constructor(val){
        this.val = val
        this.next = null
    }
}

class SLL {
    constructor(){
        this.head = null
    }
    //construct the class for SLL
}



//create a list of nodes following (1) -> (2) -> (3) -> null
// you can use the helper function printNode(node)
var a = new Node(1)
var b =  new Node(2)
a.next = b
var c = new Node(3)
b.next = c
printNode(a);

//create a SingleLinkedList with the above nodes. ** (1) as the head
// you can use the helper function printList(list) 
var list = new SLL();
list.head = a;
printList(list);

//Print the nodes
function printNode(node){
	var str="";
	var curr = node
	while(curr){
		str+=curr.val+" -> ";
		curr=curr.next;

	}
	str+="null";
    console.log(str)

}



//Print the SLL 
function printList(list){
	if(!list.head){
		return "Empty list"
	}
	var str="";
	console.log("List head: "+list.head.val)
	var curr = list.head;
	while(curr){
		str+=curr.val+" -> ";
		curr=curr.next;

	}
	str+="null";
    console.log(str)
}

