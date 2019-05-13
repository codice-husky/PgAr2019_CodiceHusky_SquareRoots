package squareRoots;

import java.util.LinkedList;

public class Node {	
	protected Node parentNode = null;
	protected LinkedList<Node> childNodes = new LinkedList<Node>();
	/**
	 * @param parentNode
	 */
	public Node(Node parentNode) {
		this.parentNode = parentNode;
	}
	/**
	 * 
	 */
	public Node() {
	}
	
	public boolean hasChilds() {
		if(childNodes.isEmpty()) return false;
		else return true;
	}
	
}
