package Strategy;

public class Flying implements Strategy{

	@Override
	public void move(String s) {
		System.out.printf(s + " is flying\n");
		
	}

}
