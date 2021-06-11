package strategy;

public class DogComparatorByHeight implements DogComparator {

	@Override
	public int compare(AbstractAnimal a1, AbstractAnimal a2) {
		// TODO Auto-generated method stub
		Integer height1 = ((Dog)a1).height;
		Integer height2 = ((Dog)a2).height;
		return height1.compareTo(height2);
		
	}

}
