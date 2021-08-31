package javapractice;


/**
 * MyLinkedListTest class contains main function 
 * create 3 nodes
 * it outputs linked list created or not statement
 * prints the nodes
 * @author Mohammad Musthafa
 */
public class MyLinkedListTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);

		if (result) {
			System.out.println("Linked list is created!");
			myLinkedList.printNodes();
		} else {
			System.out.println("Linked list is not created!");
		}
	}

}
