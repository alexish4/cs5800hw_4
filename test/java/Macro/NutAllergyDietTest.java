package Macro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutAllergyDietTest {

    private NutAllergyDiet diet;

    @BeforeEach
    void setUp() {
        diet = new NutAllergyDiet();
    }

    @Test
    void makeDiet() {
        diet.makeDiet();

        assertNotNull(diet.chosenCarb, "Chosen carb should not be null after makeDiet.");
        assertNotNull(diet.chosenProtein, "Chosen protein should not be null after makeDiet.");
        assertNotNull(diet.chosenFat, "Chosen fat should not be null after makeDiet.");
    }

    @Test
    void chooseCarb() {
        diet.chooseCarb();

        assertNotEquals("Pistachio", diet.chosenCarb, "Chosen carb should not be Pistachio.");
        assertTrue(diet.carbs.contains(diet.chosenCarb), "Chosen carb should be from the list of available carbs.");
    }

    @Test
    void chooseProtein() {
        diet.chooseProtein();

        assertNotNull(diet.chosenProtein, "Chosen protein should not be null.");
        assertTrue(diet.protein.contains(diet.chosenProtein), "Chosen protein should be from the list of available proteins.");
    }

    @Test
    void chooseFat() {
        diet.chooseFat();

        assertNotEquals("Peanuts", diet.chosenFat, "Chosen fat should not be Peanuts.");
        assertTrue(diet.fats.contains(diet.chosenFat), "Chosen fat should be from the list of available fats.");
    }
}