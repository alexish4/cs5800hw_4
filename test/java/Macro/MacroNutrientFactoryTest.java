package Macro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MacroNutrientFactoryTest {

    private MacroNutrientFactory factory;

    @BeforeEach
    void setUp() {
        factory = MacroNutrientFactory.getInstance();
    }

    @Test
    void getInstance() {
        MacroNutrientFactory anotherFactory = MacroNutrientFactory.getInstance();
        assertSame(factory, anotherFactory, "getInstance should return the same instance every time.");
    }

    @Test
    void getMacroNutrientMeal() {
        Diet noRestrictionsDiet = factory.getMacroNutrientMeal("No Restrictions");
        assertNotNull(noRestrictionsDiet, "No Restrictions diet should not be null.");
        assertTrue(noRestrictionsDiet instanceof NoRestrictionsDiet, "Should be an instance of NoRestrictionsDiet.");

        // Test getting a Paleo diet
        Diet paleoDiet = factory.getMacroNutrientMeal("Paleo");
        assertNotNull(paleoDiet, "Paleo diet should not be null.");
        assertTrue(paleoDiet instanceof PaleoDiet, "Should be an instance of PaleoDiet.");

        // Test getting a Vegan diet
        Diet veganDiet = factory.getMacroNutrientMeal("Vegan");
        assertNotNull(veganDiet, "Vegan diet should not be null.");
        assertTrue(veganDiet instanceof VeganDiet, "Should be an instance of VeganDiet.");

        // Test getting a Nut Allergy diet
        Diet nutAllergyDiet = factory.getMacroNutrientMeal("Nut Allergy");
        assertNotNull(nutAllergyDiet, "Nut Allergy diet should not be null.");
        assertTrue(nutAllergyDiet instanceof NutAllergyDiet, "Should be an instance of NutAllergyDiet.");

        // Test getting a diet with an invalid type
        Diet invalidDiet = factory.getMacroNutrientMeal("Invalid Diet");
        assertNull(invalidDiet, "Should return null for an invalid diet type.");
    }
}