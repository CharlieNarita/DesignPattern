package builder;

public class Person {
	int id;
	String name;
	String gender;
	int age;
	double height;
	double weight;
	int score;
	Location loc;
	
	private Person() {}
	
	public static class PersonBuilder {
		Person p = new Person();
		
		public PersonBuilder basicInfo(int id, String name, String gender, int age) {
			p.id = id;
			p.name = name;
			p.gender = gender;
			p.age = age;
			return this;
		}
		
		public PersonBuilder heightInfo(double height) {
			p.height = height;
			return this;
		}
		
		public PersonBuilder weightInfo(double weight) {
			p.weight = weight;
			return this;
		}
		
		public PersonBuilder scoreInfo(int score) {
			p.score = score;
			return this;
		}
		
		public PersonBuilder locationInfo(String street, String roomNo) {
			p.loc = new Location(street, roomNo);
			return this;
		}
		
		public Person build() {
			return p;
		}
	}
	
}

class Location {
	String street;
	String roomNo;
	
	public Location(String street, String roomNo) {
		this.street = street;
		this.roomNo = roomNo;
	}
}
