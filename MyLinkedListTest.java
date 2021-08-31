package javapractice;


/**
 * MyLinkedListTest class contains main function 
 * create 3 nodes
 * checks if first node is connected to second and second is connected to third node
 * if so it outputs linked list created statement
 * @author Mohammad Musthafa
 */
public class MyLinkedListTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);

		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);

		if (result) {
			System.out.println("Linked list is created!");
			myLinkedList.printNodes();
		} else {
			System.out.println("Linked list is not created!");
		}
	}

}
