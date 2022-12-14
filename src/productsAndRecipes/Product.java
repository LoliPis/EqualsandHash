package productsAndRecipes;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Product{
    private String title;
    private float price;
    private float weight;
    private boolean bought;

    public Product(String title, float price, float weight) {
        String regex = "^[А-Яа-я]*";
        Pattern pattern = Pattern.compile(regex);
        if (title != null && !title.isEmpty() && !title.isBlank()) {
            if (pattern.matcher(title).matches()) {
                this.title = title;
            }  else {
                throw new RuntimeException("Товар должен быть написан на русском");
            }
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (price != 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (weight != 0) {
            this.weight = weight;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        this.bought = false;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

