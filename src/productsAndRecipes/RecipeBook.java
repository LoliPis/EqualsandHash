package productsAndRecipes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class RecipeBook{
    private Set<Recipe> recipeList =  new LinkedHashSet<>();

    public void addNewRecipe(Recipe recipe){
        if (recipeList.contains(recipe)) {
            throw new RuntimeException("В списке уже есть рецепт " + recipe.getRecipeTitle());
        } else {
            recipeList.add(recipe);
        }
    }

    public Set<Recipe> getRecipeList() {
        return recipeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeBook that = (RecipeBook) o;
        return Objects.equals(recipeList, that.recipeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeList);
    }
}

