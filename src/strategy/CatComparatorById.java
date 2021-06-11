package strategy;

public class CatComparatorById implements CatComparator {

	@Override
	public int compare(AbstractAnimal a1, AbstractAnimal a2) {
		// TODO Auto-generated method stub
		Integer id1 = a1.id;
		Integer id2 = a2.id;
		return id1.compareTo(id2);
	}

}
