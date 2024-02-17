
/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SmoothieMachine  {
    public static String ingredients(String order) {
        // Define the menu options and their corresponding ingredients
        String[][] menu = {
                {"Classic", "strawberry", "banana", "pineapple", "mango", "peach", "honey"},
                {"Freezie", "blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt"},
                {"Greenie", "green apple", "lime", "avocado", "spinach", "ice", "apple juice"},
                {"Just Desserts", "banana", "ice cream", "chocolate", "peanut", "cherry"}
        };

        // Parse the input order and extract the menu item and restricted ingredients
        String[] orderParts = order.split(",");
        String menuItem = orderParts[0].trim();

        // Check if the requested menu item is valid
        boolean validMenuItem = Arrays.stream(menu).anyMatch(option -> option[0].equals(menuItem));
        if (!validMenuItem) {
            throw new IllegalArgumentException("Invalid menu item: " + menuItem);
        }

        // Extract the restricted ingredients
        Set<String> restrictedIngredients = new HashSet<>();
        for (int i = 1; i < orderParts.length; i++) {
            String ingredient = orderParts[i].trim();
            if (ingredient.startsWith("-")) {
                restrictedIngredients.add(ingredient.substring(1));
            } else {
                throw new IllegalArgumentException("Invalid input: " + order);
            }
        }

        // Get the ingredients for the selected menu item, excluding restricted ingredients
        Set<String> ingredientsSet = Arrays.stream(menu)
                .filter(option -> option[0].equals(menuItem))
                .flatMap(option -> Arrays.stream(option).skip(1))
                .filter(ingredient -> !restrictedIngredients.contains(ingredient))
                .collect(Collectors.toSet());

        // Sort the ingredients alphabetically and join them with commas
        return ingredientsSet.stream().sorted().collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        try {
            //System.out.println(ingredients("Classic"));
            // Uncomment the line below to test invalid input
            System.out.println(ingredients(null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

 */

