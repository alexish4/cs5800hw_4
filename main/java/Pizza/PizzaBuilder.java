package Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private static final List<String> ALL_TOPPINGS = List.of(
            "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
            "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach",
            "Tomato and Basil", "Beef", "Ham", "Pesto",
            "Spicy Pork", "Ham and Pineapple"
    );

    private List<String> selectedToppings = new ArrayList<>();
    private String size;
    private String pizzaChain;

    public PizzaBuilder setSelectedToppings(List<String> selectedToppings) {
        this.selectedToppings = selectedToppings;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }


    public PizzaBuilder setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        if (ALL_TOPPINGS.contains(topping) && !selectedToppings.contains(topping)) {
            selectedToppings.add(topping);
        }
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(selectedToppings, size, pizzaChain);
    }

}