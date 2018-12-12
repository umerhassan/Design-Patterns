package DecoratorPizza;

abstract class Topping implements PizzaComponent{
	PizzaComponent p;
	
	
	public Topping(PizzaComponent t) {
		p=t;
	}
	
	public void make() {
		p.make();
	}
	
	public double getCost() {
		return p.getCost();
	}

}
