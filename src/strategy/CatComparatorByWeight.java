package strategy;

public class CatComparatorByWeight implements CatComparator {
	
	@Override
	public int compare(AbstractAnimal a1, AbstractAnimal a2) {
		// TODO Auto-generated method stub
		Integer weight1 = ((Cat)a1).weight;
		Integer weight2 = ((Cat)a2).weight;
		return weight1.compareTo(weight2);
	}
}
