package Strategy;

public abstract class Animal { //This is a context
	String name;
	double weight;
	Strategy s;
	
	public Animal(String n,double w) {
		name=n;
		weight = w;
	}
	public void performMove() {
		s.move(name,weight);
	}
	public void setMoveStrategy(Strategy d) {
		s=d;
	}
}
