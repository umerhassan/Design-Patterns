package Strategy;

public class Flying implements Strategy{

	@Override
	public void move(String s,double weight) {
		System.out.printf(s + " is flying with weight: " + weight + "\n");
		
	}

}
