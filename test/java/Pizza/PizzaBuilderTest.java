package Pizza;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaBuilderTest {

    private PizzaBuilder pizzaBuilder;

    @BeforeEach
    void setUp() {
        pizzaBuilder = new PizzaBuilder();
    }

    @Test
    void setSelectedToppings() {
        List<String> toppings = Arrays.asList("Pepperoni", "Mushrooms");
        pizzaBuilder.setSelectedToppings(toppings);

        Pizza pizza = pizzaBuilder.createPizza();
        assertEquals(toppings, pizza.getSelectedToppings(), "The selected toppings should match.");
    }

    @Test
    void setSize() {
        String size = "Large";
        pizzaBuilder.setSize(size);

        Pizza pizza = pizzaBuilder.createPizza();
        assertEquals(size, pizza.getSize(), "The pizza size should match.");

    }

    @Test
    void setPizzaChain() {
        String chain = "Domino's";
        pizzaBuilder.setPizzaChain(chain);

        Pizza pizza = pizzaBuilder.createPizza();
        assertEquals(chain, pizza.getPizzaChain(), "The pizza chain should match.");
    }

    @Test
    void addTopping() {
        pizzaBuilder.addTopping("Pepperoni");
        pizzaBuilder.addTopping("Mushrooms");

        Pizza pizza = pizzaBuilder.createPizza();
        List<String> expectedToppings = Arrays.asList("Pepperoni", "Mushrooms");
        assertEquals(expectedToppings, pizza.getSelectedToppings(), "The selected toppings should match.");
    }

    @Test
    void createPizza() {
        pizzaBuilder.setSize("Medium")
                .setPizzaChain("Pizza Hut")
                .addTopping("Bacon")
                .addTopping("Onions");

        Pizza pizza = pizzaBuilder.createPizza();
        assertEquals("Medium", pizza.getSize(), "The size should be Medium.");
        assertEquals("Pizza Hut", pizza.getPizzaChain(), "The pizza chain should be Pizza Hut.");
        assertTrue(pizza.getSelectedToppings().contains("Bacon"), "Toppings should include Bacon.");
        assertTrue(pizza.getSelectedToppings().contains("Onions"), "Toppings should include Onions.");
    }
}