package Strategy;

public class Main{

	public static void main(String[] s) {
		Cat kitty = new Cat("Tom",33.2);
		kitty.performMove();
		Bird bird = new Bird("Cong",21.3);
		// This is wrong             Bird bird = new Animal("Cong",21.3);
		// This is wrong             Bird bird = (Bird)new Animal("Cong",21.3);
		bird.performMove();
		bird.setMoveStrategy(new Walking());
		bird.performMove();
		Animal c = new Cricket("Good",22.3);
		c.performMove();
		
	}

	

}
