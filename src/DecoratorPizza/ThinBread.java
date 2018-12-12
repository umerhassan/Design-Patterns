package DecoratorPizza;

public class ThinBread implements PizzaComponent{
	
	public void make() {
		System.out.println("Thin Bread");
		
		
	}

	@Override
	public double getCost() {
		return 4.0;
	}

}
