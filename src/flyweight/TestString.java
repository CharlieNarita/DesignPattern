package flyweight;

public class TestString {
	
	/**
	 *	in java, String type always in a string pool and still exist only one; 
	 * 	if sometimes there is new String() object in heap, it also actually pointing the only one characters in pool;
	 * 	so that same string always equals each other;
	 * 	of course except comparing two new Objects in heap unless they call intern() method;
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);	//true
		System.out.println(s1 == s3);	//false
		System.out.println(s3 == s4);	//false	
		System.out.println(s3.intern() == s1);	//true
		System.out.println(s3.intern() == s4.intern());	//true
		
	}

}
