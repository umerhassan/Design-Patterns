package Strategy;

public class Cat extends Animal{

	public Cat(String n) {
		super(n);
		s= new Walking();
	}

	

}
