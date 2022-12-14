import passortsThings.Passport;
import passortsThings.PassportHashMap;
import productsAndRecipes.Product;
import productsAndRecipes.Recipe;
import productsAndRecipes.RecipeBook;
import productsAndRecipes.ShopList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Дз 1
        Product bananas = new Product("Бананы", 120f, 1f);
        Product oranges = new Product("Апельсины", 150f, 2f);
        Product cucumbers = new Product("Огурцы", 1230f, 2f);
       ShopList shopListFirst  = new ShopList();
        ShopList shopListSec  = new ShopList();
        ShopList shopListThird  = new ShopList();
        shopListFirst.addNewProduct(bananas);
        shopListFirst.addNewProduct(oranges);
        shopListFirst.addNewProduct(cucumbers);
        shopListSec.purchaseProduct(oranges);
        shopListThird.deleteProduct(cucumbers);
//        shopListFirst.addNewProduct(bananas);
//        //Дз 2
        Recipe recipe1 = new Recipe("recipe1");
        recipe1.addProductToRecipe(bananas);
        System.out.println(recipe1.toString());
        recipe1.addProductToRecipe(oranges);
        recipe1.addProductToRecipe(cucumbers);
        System.out.println(recipe1.toString());
        Recipe recipe2 = new Recipe("recipe2");
        recipe2.addProductToRecipe(oranges);
        System.out.println(recipe2.toString());
        recipe2.addProductToRecipe(cucumbers);
        recipe2.addProductToRecipe(bananas);

        Recipe recipe3 = new Recipe("recipe1");
        RecipeBook recipeBook1 = new RecipeBook();
        recipeBook1.addNewRecipe(recipe1);
        recipeBook1.addNewRecipe(recipe2);
        recipeBook1.addNewRecipe(recipe3);
        // Дз 2
        // Задание 2
        int initialCapacity = 20;
        Set<Integer> integers =  new HashSet<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            integers.add((int) (Math.random() * 1001));
        }
        integers.removeIf(integer -> (integer % 2 != 0));
        integers.forEach(System.out::println);
        //Дз 3
        //Задание 2
        Set<String>  multiplicationTasks = new HashSet<>();
        int questionCount = 15;
        while (multiplicationTasks.size() < 15) {
            int firstNum = (int) (2 + 8 * Math.random());
            int secondNum = (int) (2 + 8 * Math.random());
            if (!multiplicationTasks.contains(String.format("%d x %d =", secondNum, firstNum))) {
                multiplicationTasks.add(String.format("%d x %d =", firstNum, secondNum));
            }
        }
        multiplicationTasks.forEach(System.out::println);
        //Заданиие 3
        Passport passport1 = new Passport("230492", "One", "ONE", "OnE",
                "21.01.1998");
        Passport passport2 = new Passport("230492", "Two", "TWO", "OnE",
                "21.01.1996");
        Passport passport3 = new Passport("452345", "Three", "THREE", "ThReE",
                "21.01.2000");
        PassportHashMap passportsList = new PassportHashMap();
        passportsList.addNewPassport(passport1);
        passportsList.printMap();
        passportsList.addNewPassport(passport2);
        passportsList.printMap();
        passportsList.addNewPassport(passport3);
        passportsList.printMap();
        passportsList.addNewPassport(passport1);
        passportsList.printMap();
        System.out.println(passportsList.findPassport(passport1.getPassportNumber()));
        System.out.println(passportsList.findPassport("2341234"));
        System.out.println(passportsList.findPassport("452345"));
        //Задание 4
        /*
        ответ HashSet, так как все, что связано с хешем проверяет не сами данные, а их хеш, который всегда фиксированной
        длины, чем проверять огромые объемы данных, сравнивая из друг с другом. Обработка большого объема данных в "чистую"
        будет затрачивать больше ресурсов - соответственно потребуется больше времени на сравнение этих данных друг с
        другом
         */
    }
}