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
	
	/**
	 * @method appends an element to the linked list
	 * @param newNode contains new node value
	 */
	public void append(INode<k> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	
	/**
	 * @method inserts an node after the required node
	 * @param myNode contains node where new node is added front of it
	 * @param newNode contains new node value
	 * @return nothing
	 */
	public void insert(INode<k> myNode,INode<k> newNode) {
		INode<k> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	/**@method to delete the first element from the linked list
	 * @return head pointing at second element
	 */
	public INode<k> pop(){
		INode<k> tempNode = this.head;			//store current head value in a temperory node
		this.head = head.getNext();
		return tempNode;
	}
	
	/**
	 * @method used to delete last element from the linked list
	 * @return the delete node
	 */
	public INode<k> popLast() {
		INode<k> curNode = head;
		INode<k> prevNode = null;
		while(curNode != null && curNode.getNext() != null) {
			prevNode = curNode;
			curNode = curNode.getNext();
		}
		prevNode.setNext(null);
		return curNode;
	}
	
	/**
	 * @method used to search element in the linked list
	 * @return null
	 */
	public INode<k> search(k Key) {
		INode<k> tempNode = head;
		while(tempNode != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	//@method to print the nodes of linked list
	public void printNodes() {
		System.out.println("My Nodes: "+head);
	}
}
