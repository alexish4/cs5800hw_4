package Macro;

import java.util.Random;

public class NoRestrictionsDiet extends Diet{
    @Override
    public void makeDiet() {
        this.chooseCarb();
        this.chooseProtein();
        this.chooseFat();
    }

    @Override
    public void chooseCarb() {
        Random random = new Random();
        int index = random.nextInt(carbs.size());
        chosenCarb = carbs.get(index);
    }

    @Override
    public void chooseProtein() {
        Random random = new Random();
        int index = random.nextInt(protein.size());
        chosenProtein = protein.get(index);
    }

    @Override
    public void chooseFat() {
        Random random = new Random();
        int index = random.nextInt(fats.size());
        chosenFat = fats.get(index);
    }
}
