package Iterator.demo1;

/**
 *	compare to array, array list do not consider the boundary problem, its allow dynamic extension;
 *	all logical storage patterns' bottom physical structure are array and linked list;
 *
 */

public class ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array list = new Array();
		for(int i=0; i<12; i++) {
			list.add(new String("s" + i));
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.getObj(i) + " ");
		}
		
		System.out.println();
		System.out.println(list.size());
	}

}


//array pattern demo
class Array {
	Object[] objects = new Object[10];
	
	//the index means where next empty location of objects, in other words how many elements in objects now;
	private int  index = 0;
	
	public void add(Object o) {
		if(index == objects.length) {
			Object[] newObjects = new Object[objects.length*2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		
		objects[index] = o;
		index ++;
	}
	
	public int size() {
		return index;
	}
	
	public Object getObj(int i) {
		return objects[i];
	}
}


