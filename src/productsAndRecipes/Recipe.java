package productsAndRecipes;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe{

    private HashMap<Product,  Integer> recipeProductsList = new HashMap<>();
    private float  sumProductsListRecipe;
    private String recipeTitle;

    public Recipe(String recipeTitle) {
        this.recipeTitle = recipeTitle;
        this.sumProductsListRecipe = 0;
    }

    public void addProductToRecipe(Product product) {
        recipeProductsList.put(product, 1);
        this.sumProductsListRecipe = countSumProductsListRecipe();
    }

    public void addProductToRecipe(Product product, Integer productCount) {
        recipeProductsList.put(product, productCount);
        this.sumProductsListRecipe = countSumProductsListRecipe();
    }


    private float countSumProductsListRecipe(){
        return getSumProductsListRecipe();
    }

    public HashMap<Product, Integer> getRecipeProductsList() {
        return recipeProductsList;
    }

    public void setRecipeProductsList(HashMap<Product, Integer> recipeProductsList) {
        this.recipeProductsList = recipeProductsList;
    }

    public float getSumProductsListRecipe() {
        sumProductsListRecipe = 0;
        recipeProductsList.forEach((k, v) -> sumProductsListRecipe += k.getPrice() * v);
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
    public String toString() {
        return "Recipe{" +
                "recipeProductsList=" + recipeProductsList.values() +
                ", sumProductsListRecipe=" + sumProductsListRecipe +
                ", recipeTitle='" + recipeTitle + '\'' +
                '}';
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
