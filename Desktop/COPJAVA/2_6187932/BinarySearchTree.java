	
//******Part 3**********

class BinarySearchTreeNode
	{
		public int key;		
		public BinarySearchTreeNode left;
		public BinarySearchTreeNode right;
		//public BinarySearchTreeNode head;
		
		public BinarySearchTreeNode(int element)//constructor
		{
			key=element;
			left=null;
			right=null;
		}
	}
	
	public class BinarySearchTree
	{
	BinarySearchTreeNode head;
		
	BinarySearchTree()
	{
	head=null;	
	}
	
	int Sum=0;
	
	//the sum of all nodes
	public int keySum(BinarySearchTreeNode node)
	{
		if (node == null) //If node is null then return the sum
		{
			return Sum;
		}
		//If node is not null, then add key value with sum
		Sum+=node.key;
		//Traverse 
		Sum=keySum(node.left);
		Sum=keySum(node.right);
		return Sum;
		}		
	
	//Deleting the minimum value of the binary tree
	public void deleteMin(BinarySearchTreeNode node)
	{
	if(node==null) //If empty return
	{
		return;
	}
	//If left node is empty head is the minimum value,delete and make right node as head
	if(node.left.left==null) 
	{
	if(node==head)
	{
		head=node.right;
	}
	else
		node.left=null;
	return;
	}
	deleteMin(node.left);
	}
	//increasing order print
	public void printTree(BinarySearchTreeNode node)
	{
	//Return if node is null
	if (node == null)
	{
		return;
	}

	printTree(node.left);
	System.out.print(node.key + " ");
	printTree(node.right);
	}
	
	//Method to print data in postorder
	public void printPostorder(BinarySearchTreeNode node)
	{
	//Return if node is empty
	if (node == null)
	return;
	//Order traverse reached the last left node,print,then print right node, then head 
	printPostorder(node.left);
	printPostorder(node.right);
	System.out.print(node.key + " ");
	}

	
	public static void main(String[] args)
	{
	//Main class object
	BinarySearchTree tree = new BinarySearchTree();
	//Binary tree
	tree.head = new BinarySearchTreeNode(4);
	tree.head.left = new BinarySearchTreeNode(2);
	tree.head.right = new BinarySearchTreeNode(5);
	tree.head.left.left = new BinarySearchTreeNode(1);
	tree.head.left.right = new BinarySearchTreeNode(3);
	
	System.out.println("Sum of all the nodes: " + tree.keySum(tree.head));
	tree.Sum=0;
	System.out.print("Binary tree in increasing order: ");
	tree.printTree(tree.head);
	System.out.print("\nPostorder of binary tree: ");
	tree.printPostorder(tree.head);
	System.out.println("");
	System.out.println("Applying minimal node deletion");
	tree.deleteMin(tree.head);
	System.out.println("Sum of all the nodes: " + tree.keySum(tree.head));
	tree.Sum=0;
	System.out.print("Binary tree in increasing order : ");
	tree.printTree(tree.head);
	System.out.print("\nPostorder of binary tree: ");
	tree.printPostorder(tree.head);
	}
	}