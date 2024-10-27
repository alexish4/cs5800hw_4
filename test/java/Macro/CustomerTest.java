package Macro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;
    private MacroNutrientFactory macroFactory;

    @BeforeEach
    void setUp() {
        customer = new Customer();
        macroFactory = MacroNutrientFactory.getInstance();
    }

    @Test
    void setName() {
        customer.setName("John");
        assertEquals("John", customer.getName());
    }

    @Test
    void setDietType() {
        customer.setDietType("Vegan");
        assertEquals("Vegan", customer.getDietType());
    }

    @Test
    void setDiet() {
        customer.setDietType("Vegan");
        customer.setDiet(macroFactory.getMacroNutrientMeal(customer.getDietType()));

        assertNotNull(customer.getDiet());
        assertEquals("VeganDiet", customer.getDiet().getClass().getSimpleName());
    }

    @Test
    void printCustomerAndDiet() {
        customer.setName("John");
        customer.setDietType("Vegan");
        customer.setDiet(macroFactory.getMacroNutrientMeal(customer.getDietType()));

        assertDoesNotThrow(() -> customer.printCustomerAndDiet());
    }
}