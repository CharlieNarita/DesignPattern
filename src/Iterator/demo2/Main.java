package Iterator.demo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo list = new ArrayListDemo();
		for(int i=0; i<20; i++) {
			list.add(new String("str" + i));
		}
		System.out.println("the list length is " + list.size());
		
		IteratorDemo it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
