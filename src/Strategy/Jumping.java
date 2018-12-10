package Strategy;

public class Jumping implements Strategy{

	@Override
	public void move(String s,double weight) {
		System.out.printf(s + " is jumping with weight: " + weight + "\n");
		
	}

}
