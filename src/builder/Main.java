package builder;

public class Main {
	public static void main(String[] args) {
		TerrainBuilder builder = new ComplexTerrainBuilder();
		Terrain t = builder.buildWall().buildFort().buildMine().build();
		
		Person p = new Person.PersonBuilder()
				.basicInfo(888, "Test", "F", 12)
				.heightInfo(168)
				.weightInfo(110)
				.scoreInfo(95)
				.locationInfo("TestStreet", "Test123")
				.build();
		
		
		System.out.println(t);
		System.out.println(p);
		
	}
}
