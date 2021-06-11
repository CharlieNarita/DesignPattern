package strategy;

public class CatComparatorByName implements CatComparator {

	@Override
	public int compare(AbstractAnimal a1, AbstractAnimal a2) {
		// TODO Auto-generated method stub
		String str1 = a1.name;
		String str2 = a2.name;
		return str1.compareTo(str2);
	}
}
