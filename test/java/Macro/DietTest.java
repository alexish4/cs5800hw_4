package Macro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DietTest {

    private Diet diet;

    @BeforeEach
    void setUp() {
        diet = new NoRestrictionsDiet();
    }

    @Test
    void makeDiet() {
        diet.makeDiet();

        assertNotNull(diet.chosenCarb, "Carb should be chosen by makeDiet.");
        assertNotNull(diet.chosenProtein, "Protein should be chosen by makeDiet.");
        assertNotNull(diet.chosenFat, "Fat should be chosen by makeDiet.");
    }

    @Test
    void chooseCarb() {
        diet.chooseCarb();
        assertTrue(diet.carbs.contains(diet.chosenCarb), "Chosen carb should be from the list of available carbs.");
    }

    @Test
    void chooseProtein() {
        diet.chooseProtein();
        assertTrue(diet.protein.contains(diet.chosenProtein), "Chosen protein should be from the list of available proteins.");
    }

    @Test
    void chooseFat() {
        diet.chooseFat();
        assertTrue(diet.fats.contains(diet.chosenFat), "Chosen fat should be from the list of available fats.");
    }

    @Test
    void printDiet() {
        diet.makeDiet();
        diet.printDiet();
    }
}