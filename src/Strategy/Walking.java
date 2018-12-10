package Strategy;

public class Walking implements Strategy{

	@Override
	public void move(String s,double weight) {
		System.out.printf(s + " is walking with weight: " + weight + "\n");
		
	}

}
