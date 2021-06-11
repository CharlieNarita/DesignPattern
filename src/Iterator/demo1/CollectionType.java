package Iterator.demo1;

public class CollectionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo c = new MyArray();
		for(int i=0; i<20; i++) {
			c.add(new String("str" + i));
		}
		System.out.println(c.size());
		
		CollectionDemo c2 = new MyLinkedList();
		for(int i=0; i<30; i++) {
			c2.add(new String("str" + i));
		}
		System.out.println(c2.size());
	}

}

interface CollectionDemo {
	void add(Object o);
	int size();
}

class MyArray implements CollectionDemo {
	Object[] objects = new Object[10];
	
	private int index = 0;
	
	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		if(index == objects.length) {
			Object[] newObjects = new Object[objects.length * 2];
			objects = newObjects;
		}
		
		objects[index] = o;
		index++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index;
	}
	
	public Object get(int i) {
		return objects[i];
	}
	
}

class MyLinkedList implements CollectionDemo {
	Node head = null;
	Node tail = null;
	private int size = 0;
	
	//define a inner class Node
	private class Node {
		private Object o;
		Node next;
		
		public Node(Object o) {
			this.o = o;
		}
	}
	
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
		size++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
