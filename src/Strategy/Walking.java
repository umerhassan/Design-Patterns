package Strategy;

public class Walking implements Strategy{

	@Override
	public void move(String s) {
		System.out.printf(s + " is walking\n");
		
	}

}
