package Macro;

public class MacroNutrientFactory {
    private static MacroNutrientFactory instance;

    // Private constructor to prevent instantiation
    private MacroNutrientFactory() {}

    public static MacroNutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacroNutrientFactory();
        }
        return instance;
    }

    public Diet getMacroNutrientMeal(String dietType) {
        switch (dietType) {
            case "No Restrictions":
                NoRestrictionsDiet noRestrictionsDiet = new NoRestrictionsDiet();
                noRestrictionsDiet.makeDiet();
                return noRestrictionsDiet;
            case "Paleo":
                PaleoDiet paleoDiet = new PaleoDiet();
                paleoDiet.makeDiet();
                return paleoDiet;
            case "Vegan":
                VeganDiet veganDiet = new VeganDiet();
                veganDiet.makeDiet();
                return veganDiet;
            case "Nut Allergy":
                NutAllergyDiet nutAllergyDiet = new NutAllergyDiet();
                nutAllergyDiet.makeDiet();
                return nutAllergyDiet;
            default:
                return null;
        }
    }
}
