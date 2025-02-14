package com.generics.mealplangenerator;

public class MealPlanGenerator {
    public static void main(String[] args) {
        // Create meal storage for different meal types
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        Meal<VeganMeal> veganPlan = new Meal<>();
        Meal<KetoMeal> ketoPlan = new Meal<>();
        Meal<HighProteinMeal> highProteinPlan = new Meal<>();

        // Add meals to respective meal plans
        vegetarianPlan.addMeal(new VegetarianMeal("Vegetable Stir-Fry"));
        vegetarianPlan.addMeal(new VegetarianMeal("Paneer Tikka"));

        veganPlan.addMeal(new VeganMeal("Tofu Salad"));
        veganPlan.addMeal(new VeganMeal("Vegan Smoothie"));

        ketoPlan.addMeal(new KetoMeal("Grilled Chicken with Avocado"));
        ketoPlan.addMeal(new KetoMeal("Keto Cheese Omelet"));

        highProteinPlan.addMeal(new HighProteinMeal("Protein Pancakes"));
        highProteinPlan.addMeal(new HighProteinMeal("Chicken Breast with Quinoa"));

        // Generate and validate meal plans
        System.out.println("Vegetarian Meal Plan:");
        Meal.generateMealPlan(vegetarianPlan.getMeals());

        System.out.println("\nVegan Meal Plan:");
        Meal.generateMealPlan(veganPlan.getMeals());

        System.out.println("\nKeto Meal Plan:");
        Meal.generateMealPlan(ketoPlan.getMeals());

        System.out.println("\nHigh-Protein Meal Plan:");
        Meal.generateMealPlan(highProteinPlan.getMeals());
    }
}
