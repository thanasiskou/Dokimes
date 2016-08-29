package BinarySearchTree;

public class BinaryTree {
	
	Node root; // = null;
	
	public void addNode(int key){
		Node newNode = new Node(key);
		
		if (root == null){
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inorderTraverseTree(Node focusNode){
		if(focusNode != null){
			inorderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode.key);
			inorderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void preorderTraverseTree(Node focusNode){
		if(focusNode != null){
			System.out.println(focusNode.key);
			inorderTraverseTree(focusNode.leftChild);
			inorderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void postorderTraverseTree(Node focusNode){
		if(focusNode != null){
			inorderTraverseTree(focusNode.leftChild);
			inorderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode.key);
		}
	}
	
	public static void main (String[] args){
		
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(5);
		tree.addNode(3);
		tree.addNode(7);
		tree.addNode(2);
		tree.addNode(4);
		tree.addNode(6);
		tree.addNode(10);
		
		tree.inorderTraverseTree(tree.root);
		System.out.println("\n");
		tree.preorderTraverseTree(tree.root);
		System.out.println("\n");
		tree.postorderTraverseTree(tree.root);
	}
}

class Node {
	int key;
	
	Node leftChild; // = null;
	Node rightChild; // = null;
	
	Node(int key){				//Node(int newkey)
		this.key = key;			//	key = newkey;
	}
}
