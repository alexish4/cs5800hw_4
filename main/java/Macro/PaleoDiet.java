package Macro;

import java.util.Random;

public class PaleoDiet extends Diet {
    @Override
    public void makeDiet() {
        this.chooseCarb();
        this.chooseProtein();
        this.chooseFat();
    }

    @Override
    public void chooseCarb() {
        int PISTACHIO_INDEX = 3;
        chosenCarb = carbs.get(PISTACHIO_INDEX);
    }

    @Override
    public void chooseProtein() {
        int TOFU_INDEX = 3;

        Random random = new Random();
        int index;

        //keep looping until you don't get tofu
        do {
            index = random.nextInt(protein.size());
        } while (index == TOFU_INDEX);

        chosenProtein = protein.get(index);
    }

    @Override
    public void chooseFat() {
        int SOUR_CREAM_INDEX = 1;

        Random random = new Random();
        int index;

        //keep looping until you don't get sour cream
        do {
            index = random.nextInt(fats.size());
        } while (index == SOUR_CREAM_INDEX);

        chosenFat = fats.get(index);
    }
}
