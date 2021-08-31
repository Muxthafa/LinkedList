package javapractice;

/**
 * MyNode class contains getter and setter methods
 * which set the key and next value
 */

public class MyNode<k> implements INode<k>{
	private k key;
	private INode<k> next;
	
	public MyNode(k key) {
		this.key=key;
	}

	@Override
	public k getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(k key) {
		// TODO Auto-generated method stub
		this.key = key;
		
	}

	@Override
	public INode<k> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode<k> next) {
		// TODO Auto-generated method stub
		this.next = next;
		
	}
	
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyNode{" + "key=").append(key).append('}');
		if(next != null) {
			myNodeString.append("->").append(next);
		}
		return myNodeString.toString();
	}
}
