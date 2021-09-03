package javapractice;


/**
 * MyLinkedListTest class contains main function 
 * create 3 nodes
 * it outputs linked list created or not statement
 * prints the nodes
 * @author Mohammad Musthafa
 */
public class MyLinkedListTest {
	/**
	 * @method to create a linked list
	 * @return nothing
	 */
	public static void createLinkedlist()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);

		if(result) {
			System.out.println("Linked list is created!");
		}else {
			System.out.println("Linked list is not created!");
		}
	}
	
	public static void createNodes() {
		
	}
	
	/**
	 * @method to add nodes to the linked list
	 * @return nothing
	 */
	public static void addNewNode()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		if(result)
			myLinkedList.printNodes();
		else
			System.out.println("nodes are not added:");
	}
	
	/**@method to append nodes into the linked list
	 * @return nothing
	 */
	public static void appendNode()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		
		if(result)
			myLinkedList.printNodes();
		else
			System.out.println("nodes are not added!");
	}
	
	/**@method to insert the new node between the nodes
	 * @return nothing
	 */
	public static void insertBetween()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) &&	 myLinkedList.tail.equals(myThirdNode);
		
		if(result)
		{
			myLinkedList.printNodes();
		}else {
			System.out.println("node is not added!") ;
		}
	}
	
	/**@method to delete the first node
	 * @return nothing
	 */
	public static void deleteFirst()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.pop();
		System.out.println("Element "+temp.getKey()+" deleted");
		myLinkedList.printNodes();
	}
	
	/**@method to delete he last node
	 * @return nothing
	 */
	public static void deleteLast()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.popLast();
		System.out.println(temp.getKey()+" has been deleted");
		myLinkedList.printNodes();
	}
	
	/**@method to search element 
	 * @return nothing
	 */
	public static void searchElement() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
	
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> result = myLinkedList.search(30);
		if(result == null)
			System.out.println("Element not found");
		else
			System.out.println("Element "+result.getKey()+" is found!");
		myLinkedList.printNodes();
	}
	
	/**@method which adds elements at the specified location
	 * @return nothing
	 */
	public static void insertAt() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(40);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode<Integer> temp = myLinkedList.search(30);
		if(temp != null) {
			INode<Integer> next = temp.getNext();
			temp.setNext(myFourthNode);
			myFourthNode.setNext(next);
		}else {
			System.out.println("Element not found");
		}
		System.out.println("Element added!");
		myLinkedList.printNodes();
	}
	
	/*@method deletes elements at the specified location
	 *@return nothing
	 */
	public static void deleteSpecificElement() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);

		INode<Integer> head = myLinkedList.deleteSpecific(40);
		int count = myLinkedList.countElements(head);
		System.out.println("Size of linked list is "+count);
		myLinkedList.printNodes();
	}
	
	public static void orderedLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		
		myLinkedList.sortLinkedList();
		System.out.println("Elements after sorting:");
		myLinkedList.printNodes();
	}
	public static void main(String [] args) {
		//createLinkedlist();
		//addNewNode();
		//appendNode();
		//insertBetween();
		//deleteFirst();
		//deleteLast();
		//searchElement();
		//insertAt();
		//deleteSpecificElement();
		orderedLinkedList();
	}

}
