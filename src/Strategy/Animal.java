package Strategy;

public abstract class Animal { //This is a context
	String name;
	Strategy s;
	
	public Animal(String n) {
		name=n;
	}
	public void performMove() {
		s.move(name);
	}
}
