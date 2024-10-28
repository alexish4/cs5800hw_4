package Macro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeganDietTest {

    private VeganDiet diet;

    @BeforeEach
    void setUp() {
        diet = new VeganDiet();
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

        assertNotEquals("Cheese", diet.chosenCarb, "Chosen carb should not be Cheese.");
        assertTrue(diet.carbs.contains(diet.chosenCarb), "Chosen carb should be from the list of available carbs.");
    }

    @Test
    void chooseProtein() {
        diet.chooseProtein();
        assertEquals("Tofu", diet.chosenProtein, "Chosen protein should be Tofu.");
    }

    @Test
    void chooseFat() {
        diet.chooseFat();

        assertNotEquals("Tuna", diet.chosenFat, "Chosen fat should not be Tuna.");
        assertNotEquals("Sour cream", diet.chosenFat, "Chosen fat should not be Sour cream.");

        assertTrue(diet.fats.contains(diet.chosenFat), "Chosen fat should be from the list of available fats.");
    }
}