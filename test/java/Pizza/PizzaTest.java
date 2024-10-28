package Pizza;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void setSelectedToppings() {
        List<String> toppings = new ArrayList<>();
        toppings.add("Pepperoni");
        toppings.add("Mushrooms");

        pizza.setSelectedToppings(toppings);
        assertEquals(toppings, pizza.getSelectedToppings(), "Selected toppings should match the set toppings.");
    }

    @Test
    void setSize() {
        String size = "Large";
        pizza.setSize(size);
        assertEquals(size, pizza.getSize(), "Pizza size should match the set size.");
    }

    @Test
    void setPizzaChain() {
        String chain = "Domino's";
        pizza.setPizzaChain(chain);
        assertEquals(chain, pizza.getPizzaChain(), "Pizza chain should match the set chain.");
    }

    @Test
    void addTopping() {
        pizza.addTopping("Pepperoni");
        assertTrue(pizza.getSelectedToppings().contains("Pepperoni"), "Pizza should contain the added topping.");

        // Test adding a duplicate topping
        pizza.addTopping("Pepperoni");
        assertEquals(1, pizza.getSelectedToppings().size(), "Pizza should not contain duplicate toppings.");

        // Test adding an invalid topping
        pizza.addTopping("Invalid Topping");
        assertFalse(pizza.getSelectedToppings().contains("Invalid Topping"), "Pizza should not contain invalid toppings.");
    }

    @Test
    void eat() {
        pizza.setPizzaChain("Pizza Hut");
        pizza.setSize("Large");
        List<String> toppings = new ArrayList<>();
        toppings.add("Pepperoni");
        toppings.add("Mushrooms");
        pizza.setSelectedToppings(toppings);

        String expectedOutput = "Pizza is from: Pizza Hut\nSize is Large\nSelected toppings: Pepperoni, Mushrooms\n";
        assertEquals(expectedOutput, pizza.eat(), "The output of eat() should match the expected format.");
    }
}