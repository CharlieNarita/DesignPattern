package Iterator.demo1;

public class LinkedListType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo link = new LinkedListDemo();
		for(int i=0; i<12; i++) {
			link.add(new String("s" + i));
		}
		
		System.out.println(link.size());
	}

}

//linked list pattern demo 
class LinkedListDemo {
	Node head = null;
	Node tail = null;

	//how many elements in linked list
	private int size = 0;
	
	private class Node {
		private Object o;
		Node next;
		
		public Node(Object o) {
			this.o = o;
		}
	}
	
	public void add(Object o) {
		Node n = new Node(o);
		n.next = null;
		
		if(head == null) {
			head = n;
			tail = n;
		}
		
		tail.next = n;
		tail = n;
		size++;
	}
	
	
	public int size() {
		return size;
	}

}