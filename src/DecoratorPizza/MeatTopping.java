package DecoratorPizza;

public class MeatTopping extends Topping {

	public MeatTopping(PizzaComponent t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	public void make() {
		p.make();
		System.out.println("Meat Topping");
		
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost() + 3;
	}

}
