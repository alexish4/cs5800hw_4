package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private static final List<String> ALL_TOPPINGS = List.of(
            "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
            "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach",
            "Tomato and Basil", "Beef", "Ham", "Pesto",
            "Spicy Pork", "Ham and Pineapple"
    );

    private List<String> selectedToppings = new ArrayList<>();
    private String size;
    private String pizzaChain;

    public Pizza(List<String> selectedToppings, String size, String pizzaChain) {
        this.selectedToppings = selectedToppings;
        this.size = size;
        this.pizzaChain = pizzaChain;
    }

    public Pizza() {
        this.size = "Medium";
    }

    public List<String> getSelectedToppings() {
        return selectedToppings;
    }

    public void setSelectedToppings(List<String> selectedToppings) {
        this.selectedToppings = selectedToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPizzaChain() {
        return pizzaChain;
    }

    public void setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
    }

    public void addTopping(String topping) {
        if (ALL_TOPPINGS.contains(topping) && !selectedToppings.contains(topping)) {
            selectedToppings.add(topping);
        }
    }

    //Structuring with string builder for testing
    public String eat() {
        StringBuilder result = new StringBuilder();
        result.append("Pizza is from: ").append(pizzaChain).append("\n");
        result.append("Size is ").append(size).append("\n");
        result.append("Selected toppings: ");

        if (selectedToppings.isEmpty()) {
            result.append("None");
        } else {
            for (int i = 0; i < selectedToppings.size(); i++) {
                result.append(selectedToppings.get(i));
                if (i != selectedToppings.size() - 1) {
                    result.append(", ");
                }
            }
        }
        result.append("\n");
        System.out.println(result.toString());
        return result.toString();
    }

}
