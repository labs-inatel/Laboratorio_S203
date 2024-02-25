package builder.pizzaria;

public class PizzaBuilder {
	private Pizza pizza  = new Pizza();
	
	public PizzaBuilder defineSize(Integer Size) {
		pizza.setSize(Size);
		return this;
	}
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	public Pizza getPizza() {
	    if (pizza.getSize() == null || (pizza.getSize() != 1 && pizza.getSize() != 2 && pizza.getSize() != 3)) {
	        throw new IllegalStateException("Tamanho da pizza deve ser 1, 2 ou 3.");
	    }

	    if (!pizza.getFlagCheese() && !pizza.getFlagPepperoni()) {
	        throw new IllegalStateException("Uma pizza precisa ter pelo menos um ingrediente.");
	    }

	    return pizza;
	}
}
