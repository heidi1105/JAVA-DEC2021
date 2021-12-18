/**
 * Class to represent a Node in a Binary Search Tree (BST).
 */
class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}


class BinarySearchTree {
  constructor() {
    this.root = null;
  }

  isEmpty() {
    // determine if the BST is empty and return a boolean
    if(this.root === null) {
      return true;
    } 
    return false;
  }

  contains(searchVal){
    let curr = this.root;
    while(curr){
      if(searchVal === curr.data){
        return true;
      }else if(searchVal< curr.data){
        curr = curr.left;
      }else{
        curr = curr.right
      }
    }
    return false
    //Determine if the tree contains the given searchVal
  }

  insert(newVal){
    let newNode = new Node(newVal)
    if(!this.root){
      this.root = newNode;
      return;
    }
      let curr = this.root;
    
    while( newVal < curr.data){
      if(!curr.left){
        curr.left = newNode;
        return
      }
      curr = curr.left;
    }
    while( newVal > curr.data){
      if(!curr.right){
        curr.right = newNode;
        return
      }
      curr = curr.right;
    }


  }

  containsRecursive(searchVal, curr = this.root){
    if(!curr){
      return false;
    }
    if(searchVal === curr.data){
      return true;
    }else if(searchVal<curr.data){
      return this.containsRecursive(searchVal, curr.left)
    }else if (searchVal > curr.data){
      return this.containsRecursive(searchVal, curr.right)
    }
    //Determine if the tree contains the given searchVal using recursive
  }

  preOrderPrint(curr = this.root){
    
  }


  // Logs this tree horizontally with the root on the left.
  print(node = this.root, spaceCnt = 0, spaceIncr = 10) {
    if (!node) {
      return;
    }

    spaceCnt += spaceIncr;
    this.print(node.right, spaceCnt);

    console.log(
      " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
        `${node.data}`
    );

    this.print(node.left, spaceCnt);
  }
}

const emptyTree = new BinarySearchTree();
const oneNodeTree = new BinarySearchTree();
oneNodeTree.root = new Node(10);


/* twoLevelTree
        root
        10
      /   \
    5     15
*/
const twoLevelTree = new BinarySearchTree();
twoLevelTree.root = new Node(10);
twoLevelTree.root.left = new Node(5);
twoLevelTree.root.right = new Node(15);
twoLevelTree.root.left.left = new Node(2);
twoLevelTree.root.right.right = new Node(20);
// twoLevelTree.print();


/* threeLevelTree
                    root
                <-- 10 -->
              /            \
            5             15
          /    \         /    \
        2       8      12     20
*/



const threeLevelTree = new BinarySearchTree();
threeLevelTree.root = new Node(10);
threeLevelTree.root.left = new Node(5);
threeLevelTree.root.right = new Node(15);
threeLevelTree.root.left.left = new Node(2);
threeLevelTree.root.left.right = new Node(8);
threeLevelTree.root.right.left = new Node(12);
threeLevelTree.root.right.right = new Node(20);
// threeLevelTree.print();
console.log(threeLevelTree.containsRecursive(12))

let insertTree = new BinarySearchTree();
insertTree.insert(10);
insertTree.insert(5);
insertTree.insert(15);
insertTree.insert(2);
insertTree.insert(8);
insertTree.insert(17);
insertTree.insert(12);
insertTree.insert(20);
insertTree.print();