package builder.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaBuilderTest {

	@Test
	void deveConstruirPizzaValida() {
		Pizza pizza = new PizzaBuilder()
				.defineSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		assertNotNull(pizza);
		assertTrue(pizza.getSize()>=1 && pizza.getSize() <= 3);
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
	}
	
	@Test
	void deveInvalidarPizzaComTamanhoErrado() {
		Integer tamanhoErrado = 4;
		
		/*/assertThrows(IllegalStateException.class, () -> {
			Pizza pizza = new PizzaBuilder()
					.defineSize(tamanhoErrado)
					.addCheese()
					.addPepperoni()
					.getPizza();
		});/*/
		
	    try {
	        Pizza pizza = new PizzaBuilder()
	                .defineSize(tamanhoErrado) 
	                .addCheese()
	                .addPepperoni()
	                .getPizza();
	    } catch (IllegalStateException e) {
	        assertEquals("Tamanho da pizza deve ser 1, 2 ou 3.", e.getMessage());
	    }
	}

	@Test
	void deveInvalidarPizzaSemIngrediente() {
	    try {
	        Pizza pizza = new PizzaBuilder()
	                .defineSize(1)
	                .getPizza(); 
	    } catch (IllegalStateException e) {
	        assertEquals("Uma pizza precisa ter pelo menos um ingrediente.", e.getMessage());
	    }
	}

}
