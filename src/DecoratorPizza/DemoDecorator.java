package DecoratorPizza;

public class DemoDecorator {

	public static void main(String[] args) {
		PizzaComponent pizza = new MeatTopping((new CheeseTopping(new ThinBread())));
		pizza.make();
		System.out.println("Price: "+ pizza.getCost());
		System.out.println();
		PizzaComponent pizza2 = new MeatTopping(new ThinBread());
		pizza2.make();
		System.out.println("Price: "+ pizza2.getCost());
	}

}
