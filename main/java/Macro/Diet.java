package Macro;

import java.util.List;

public abstract class Diet {
    protected List<String> carbs = List.of(
            "Cheese", "Bread", "Lentils", "Pistachio"
    );

    protected List<String> protein = List.of(
            "Fish", "Chicken", "Beef", "Tofu"
    );

    protected List<String> fats = List.of(
            "Avocado", "Sour cream", "Tuna", "Peanuts"
    );

    protected String chosenCarb;
    protected String chosenProtein;
    protected String chosenFat;

    public abstract void makeDiet();

    public abstract void chooseCarb();
    public abstract void chooseProtein();
    public abstract void chooseFat();

    public void printDiet() {
        System.out.println("Carb: " + chosenCarb);
        System.out.println("Protein: " + chosenProtein);
        System.out.println("Fat: " + chosenFat);
    }
}
