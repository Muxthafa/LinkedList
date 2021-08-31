package javapractice;

public class MyLinkedList<k> {
	public INode<k> head;
	public INode<k> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		
	}
	
	/**
	 * @method adds an element to the linked list
	 * @param newNode contains the new node value
	 * @return nothing
	 */
	public void add(INode<k> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<k> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	
	//@method to print the nodes of linked list
	public void printNodes() {
		System.out.println("My Nodes: "+head);
	}
}
