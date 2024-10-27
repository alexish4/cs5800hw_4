package Macro;

import java.util.Random;

public class VeganDiet extends Diet {
    @Override
    public void makeDiet() {
        this.chooseCarb();
        this.chooseProtein();
        this.chooseFat();
    }

    @Override
    public void chooseCarb() {
        int CHEESE_INDEX = 0;

        Random random = new Random();
        int index;

        //keep looping until you don't get cheese
        do {
            index = random.nextInt(carbs.size());
        } while (index == CHEESE_INDEX);

        chosenCarb = carbs.get(index);
    }

    @Override
    public void chooseProtein() {
        int TOFU_INDEX = 3;
        chosenProtein = protein.get(TOFU_INDEX);
    }

    @Override
    public void chooseFat() {
        int TUNA_INDEX = 2;
        int SOUR_CREAM_INDEX = 1;

        Random random = new Random();
        int index;

        //keep looping until you don't get tuna or sour cream
        do {
            index = random.nextInt(carbs.size());
        } while (index == TUNA_INDEX || index == SOUR_CREAM_INDEX);
        chosenFat = fats.get(index);
    }
}
