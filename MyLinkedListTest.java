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
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);

		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		
		if(result)
			System.out.println("Linked list is created!");
		else 
			System.out.println("Linked list is not created!");
	}
	
}
