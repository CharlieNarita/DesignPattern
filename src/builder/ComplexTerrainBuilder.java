package builder;

public class ComplexTerrainBuilder implements TerrainBuilder{

	Terrain terrain = new Terrain();
	
	@Override
	public TerrainBuilder buildWall() {
		// TODO Auto-generated method stub
		terrain.w = new Wall(10, 10, 50, 50);
		return this;
	}

	@Override
	public TerrainBuilder buildFort() {
		// TODO Auto-generated method stub
		terrain.f = new Fort(20, 20, 80, 80);
		return this;
	}

	@Override
	public TerrainBuilder buildMine() {
		// TODO Auto-generated method stub
		terrain.m = new Mine(30, 30, 100, 100);
		return this;
	}

	@Override
	public Terrain build() {
		// TODO Auto-generated method stub
		return terrain;
	}

}
