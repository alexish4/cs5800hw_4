package Macro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaleoDietTest {

    private PaleoDiet diet;

    @BeforeEach
    void setUp() {
        diet = new PaleoDiet();
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

        assertEquals("Pistachio", diet.chosenCarb, "Chosen carb should be Pistachio.");
        assertTrue(diet.carbs.contains(diet.chosenCarb), "Chosen carb should be from the list of available carbs.");
    }

    @Test
    void chooseProtein() {
        diet.chooseProtein();

        assertNotEquals("Tofu", diet.chosenProtein, "Chosen protein should not be Tofu.");
        assertTrue(diet.protein.contains(diet.chosenProtein), "Chosen protein should be from the list of available proteins.");
    }

    @Test
    void chooseFat() {
        diet.chooseFat();

        assertNotEquals("Sour cream", diet.chosenFat, "Chosen fat should not be Sour cream.");
        assertTrue(diet.fats.contains(diet.chosenFat), "Chosen fat should be from the list of available fats.");
    }
}