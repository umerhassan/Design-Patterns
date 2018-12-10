package Strategy;

public class Cat extends Animal{

	public Cat(String n,double d) {
		super(n,d);
		s= new Walking();
	}

	

}
