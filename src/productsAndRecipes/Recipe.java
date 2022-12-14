package productsAndRecipes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe{

    private Set<Product> recipeProductsList = new LinkedHashSet<>();
    private float  sumProductsListRecipe;
    private String recipeTitle;

    public Recipe(String recipeTitle) {
        this.recipeTitle = recipeTitle;
        this.sumProductsListRecipe = 0;
        this.sumProductsListRecipe = countSumProductsListRecipe();
    }

    public void addProductToRecipe(Product product) {
        recipeProductsList.add(product);
        this.sumProductsListRecipe = countSumProductsListRecipe();
    }

    private float countSumProductsListRecipe(){
        return getSumProductsListRecipe();
    }

    public Set<Product> getRecipeProductsList() {
        return recipeProductsList;
    }

    public void setRecipeProductsList(Set<Product> recipeProductsList) {
        this.recipeProductsList = recipeProductsList;
    }

    public float getSumProductsListRecipe() {
        return sumProductsListRecipe;
    }

    public void setSumProductsListRecipe(float sumProductsListRecipe) {
        this.sumProductsListRecipe = sumProductsListRecipe;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeTitle, recipe.recipeTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeTitle);
    }
}
