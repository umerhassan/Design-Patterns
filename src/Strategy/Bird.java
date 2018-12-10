package Strategy;

public class Bird extends Animal{

	public Bird(String n,double d) {
		super(n,d);
		s= new Flying();
	}

	

}
