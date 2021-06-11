package Iterator.demo2;

public class LinkedListDemo implements CollectionDemo {
	
	Node head = null;
	Node tail = null;
	
	private int size = 0;
	
	
	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		Node n = new Node(o);
		n.next = null;
		
		if(head == null) {
			head = n;
			tail = n;
		}
		
		tail.next = n;
		tail = n;
		size ++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public IteratorDemo iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	
	
	private class Node {
		private Object o;
		Node next;
		
		public Node(Object o) {
			this.o = o;
		}
	}

	private class LinkedListIterator implements IteratorDemo {

		private int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			if(currentIndex >= size) {
				return false;
			}
			
			return true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
