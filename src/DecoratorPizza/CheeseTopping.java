package DecoratorPizza;

public class CheeseTopping extends Topping {

	public CheeseTopping(PizzaComponent t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public void make() {
		p.make();
		System.out.println("Cheese Topping");
		
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost()+2;
	}

}
