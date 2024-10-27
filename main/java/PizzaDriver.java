import Pizza.Pizza;
import Pizza.PizzaBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PizzaDriver {
    public static void main(String[] args) {
        pizzaDriver();
        pizzaDriver2();
    }

    public static void pizzaDriver() {
        System.out.println("Pizza Driver 1: ");

        Pizza pizzaHut1 = new PizzaBuilder().addTopping("Pepperoni").addTopping("Mushrooms").addTopping("Sausage")
                .setPizzaChain("Pizza Hut").setSize("Medium").createPizza();

        Pizza pizzaHut2 = new PizzaBuilder().addTopping("Chicken").addTopping("Bacon").addTopping("Sausage")
                .addTopping("Extra Cheese").addTopping("Pesto").addTopping("Onions").setPizzaChain("Pizza Hut")
                .setSize("Large").createPizza();

        Pizza pizzaHut3 = new PizzaBuilder().addTopping("Extra Cheese").addTopping("Peppers").addTopping("Pesto")
                .addTopping("Spicy Pork").addTopping("Tomato and Basil").addTopping("Ham and Pineapple")
                .addTopping("Pepperoni").addTopping("Mushrooms").addTopping("Sausage").setPizzaChain("Pizza Hut")
                .setSize("Small").createPizza();

        pizzaHut1.eat();
        pizzaHut2.eat();
        pizzaHut3.eat();
    }

    public static void pizzaDriver2() {
        System.out.println("Pizza Driver 2: ");

        Pizza pizzaHut1 = new PizzaBuilder().addTopping("Pepperoni").addTopping("Mushrooms").addTopping("Sausage")
                .setPizzaChain("Pizza Hut").setSize("Large").createPizza();

        Pizza pizzaHut2 = new PizzaBuilder().addTopping("Chicken").addTopping("Bacon").setSize("Small")
                .setPizzaChain("Pizza Hut").createPizza();

        Pizza littleCaesars1 = new PizzaBuilder().addTopping("Extra Cheese").addTopping("Peppers").addTopping("Pesto")
                .addTopping("Spicy Pork").addTopping("Tomato and Basil").addTopping("Ham and Pineapple")
                .addTopping("Pepperoni").addTopping("Mushrooms").setPizzaChain("Little Caesars")
                .setSize("Medium").createPizza();

        Pizza littleCaesars2 = new PizzaBuilder().addTopping("Extra Cheese").addTopping("Peppers").addTopping("Pesto")
                .addTopping("Spicy Pork").addTopping("Tomato and Basil").addTopping("Ham and Pineapple")
                .setPizzaChain("Little Caesars").setSize("Small").createPizza();

        Pizza dominos1 = new PizzaBuilder().addTopping("Extra Cheese").setSize("Small")
                .setPizzaChain("Dominos").createPizza();

        Pizza dominos2 = new PizzaBuilder().addTopping("Extra Cheese").addTopping("Peppers").addTopping("Pesto")
                .setPizzaChain("Dominos").setSize("Large").createPizza();

        pizzaHut1.eat();
        pizzaHut2.eat();
        littleCaesars1.eat();
        littleCaesars2.eat();
        dominos1.eat();
        dominos2.eat();
    }
}