package strategy;

public class Main {

	public static void main(String[] args) {
		
		
		Cat c1 = new Cat(12, "jack", 20);
		Cat c2 = new Cat(15, "mike", 18);
		Cat c3 = new Cat(17, "tom", 15);
		Cat[] cats = {c2, c1, c3};
		
		System.out.println("Original Cat[]: ");
		printArray(cats);
		System.out.println("--------------------------------");
		
		System.out.println("Sort By Weight: ");
		Sorter.sort(cats, new CatComparatorByWeight());
		printArray(cats);
		System.out.println("--------------------------------");
		
		System.out.println("Sort By Id: ");
		Sorter.sort(cats, new CatComparatorById());
		printArray(cats);
		System.out.println("--------------------------------");
		
		System.out.println("Sort By Name: ");
		Sorter.sort(cats, new CatComparatorByName());
		printArray(cats);
		System.out.println("--------------------------------");
		
		
		
		
		
		Dog[] dogs = {new Dog(5, "d12", 61), new Dog(32, "d56", 82), new Dog(19, "d64", 58)};
		System.out.println("Original Dog[]: ");
		printArray(dogs);
		System.out.println("--------------------------------");
		
		System.out.println("Sort By Height: ");
		Sorter.sort(dogs, (a1, a2)->{
			Integer height1 = ((Dog)a1).height;
			Integer height2 = ((Dog)a2).height;
			return height1.compareTo(height2);
		});
		printArray(dogs);
		System.out.println("--------------------------------");
		
	}
	
	public static <T> void printArray(T[] ts) {
		for(T t : ts) {
			System.out.println(t.toString() + " ");
		}
	}

}
