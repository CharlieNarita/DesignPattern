package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BulletPool {
	List<Bullet> bullets = new ArrayList<>();
	
	{
		for(int i=0; i<100; i++) {
			bullets.add(new Bullet());
		}
	}
	
	public Bullet getBullet() {
		for(int i=0; i<bullets.size(); i++) {
			Bullet b = bullets.get(i);
			if(!b.alive) {
				return b;
			}
		}
		
		return new Bullet();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BulletPool bp = new BulletPool();
		
		for(int i=0; i<10; i++) {
			Bullet b = bp.getBullet();
			System.out.println(b);
		}
	}
}

class Bullet {
	
	public UUID id = UUID.randomUUID();
	boolean alive = true;
	
	@Override
	public String toString() {
		return "Bullet [id=" + id + "]";
	}
}




