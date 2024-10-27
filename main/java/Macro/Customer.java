package Macro;

public class Customer {
    private String name;
    private String dietType;
    private Diet diet;

    public Customer() {
    }

    public Customer(String name, String dietType) {
        this.name = name;
        this.dietType = dietType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public void printCustomerAndDiet() {
        System.out.println("Customer Name: " + name);
        System.out.println("Diet Type: " + dietType);
        diet.printDiet();

        System.out.println();
    }
}
