package bt.traversal;

import java.util.LinkedList;
import java.util.Queue;

import bst.common.BinaryTreeNode;

public class BinaryTreeRecursiveTraversal {

	BinaryTreeNode root;

	public BinaryTreeRecursiveTraversal() {
		this.root = null;
	}

	public void preOrderTraversal(BinaryTreeNode root) {

		if (root == null) {
			return;
		}

		System.out.print(" " + root.getData());
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());

	}

	public void inOrderTraversal(BinaryTreeNode root) {

		if (root == null) {
			return;
		}

		inOrderTraversal(root.getLeft());
		System.out.print(" " + root.getData());
		inOrderTraversal(root.getRight());

	}

	public void postOrderTraversal(BinaryTreeNode root) {

		if (root == null) {
			return;
		}

		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.print(" " + root.getData());

	}

	public void levelOrderTraversal(BinaryTreeNode root) {
		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode node = queue.remove();
			System.out.print(" " + node.getData());
			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}

			if (node.getRight() != null) {
				queue.add(node.getRight());
			}
		}

	}

}
