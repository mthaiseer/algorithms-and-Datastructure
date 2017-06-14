package bt.traversal;

import bst.common.BinaryTreeNode;
/**
 *       1
 *    2     3
 *  4   5
 *   
 *  preOrder : 1 2 4 5 3
 *  in order : 4 2 5 1 3 
 *  post order: 4 5 2 3 1
 * @author mohamed.thaiseer
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		BinaryTreeRecursiveTraversal bt = new BinaryTreeRecursiveTraversal();
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.setLeft(new BinaryTreeNode(2));
		root.setRight(new BinaryTreeNode(3));
		root.getLeft().setLeft(new BinaryTreeNode(4));
		root.getLeft().setRight(new BinaryTreeNode(5));
		
		//Preorder traversal
		System.out.println("Pre order traversal");
		bt.preOrderTraversal(root);
		System.out.println();
		
		//inorder traversal
		System.out.println("In order traversal");
		bt.inOrderTraversal(root);
		
         System.out.println();
		//post order traversal
		System.out.println("Post order traversal");
		bt.postOrderTraversal(root);

		
        System.out.println();
		//level Order Traversal
		System.out.println("level Order Traversal");
		bt.levelOrderTraversal(root);

		
	}

}
