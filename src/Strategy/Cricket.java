package Strategy;

public class Cricket extends Animal{

	public Cricket(String n,double d) {
		super(n,d);
		s= new Jumping();
	}

	

}
