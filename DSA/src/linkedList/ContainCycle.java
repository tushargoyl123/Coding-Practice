package linkedList;

import java.util.HashMap;

class Node{
	Node next;
	int value;
	public Node(int value) {
		this.next = null;
		this.value = value;
	}
}
public class ContainCycle {
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = head;
		boolean isContainCycle = containsCycle(head);
		System.out.println(isContainCycle);
	}
	
	private static boolean containsCycle(Node head) {
		HashMap<Node, Boolean> visitedNodes = new HashMap<Node, Boolean>();
		Node current = head;
		while(current!=null) {
			if(visitedNodes.containsKey(current)) {
				return true;
			}
			visitedNodes.put(current, true);
			current = current.next;
		}
		return false;
	}
	
	
}
