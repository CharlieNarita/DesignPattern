package Iterator.demo2;

public class ArrayListDemo implements CollectionDemo {
	
	Object[] objects = new Object[10];
	
	private int index = 0;
	
	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		if(index == objects.length) {
			Object[] newObjects = new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index] = o;
		index ++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	@Override
	public IteratorDemo iterator() {
		// TODO Auto-generated method stub
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements IteratorDemo {
		
		private int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(currentIndex >= index) {
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			Object o = objects[currentIndex];
			currentIndex ++;
			return o;
		} 
		
	}

}
