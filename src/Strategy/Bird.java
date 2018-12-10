package Strategy;

public class Bird extends Animal{

	public Bird(String n) {
		super(n);
		s= new Flying();
	}

	

}
