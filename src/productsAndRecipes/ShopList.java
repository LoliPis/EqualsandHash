package productsAndRecipes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class ShopList {

    public Set<Product> shopList = new LinkedHashSet<>();

    public void addNewProduct(Product product){
        if (!shopList.add(product)) {
            throw new RuntimeException("В списке уже есть " + product.getTitle());
        } else {
            shopList.add(product);
        }
    }

    public static void purchaseProduct(Product product) {
        product.setBought(true);
        System.out.println(product.getTitle() + " купили.");
    }

    public float countSumProductsList(){
        float sumProducts = 0;
        for (Product countProduct: shopList) {
            sumProducts += countProduct.getPrice();
        }
        return sumProducts;
    }

    public void deleteProduct(Product product){
        shopList.remove(product);
    }

    public Set<Product> getShopList() {
        return shopList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopList shopList1 = (ShopList) o;
        return Objects.equals(shopList, shopList1.shopList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopList);
    }

}
