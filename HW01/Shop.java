package HW01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;
    public Shop() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        if (product != null) {
            products.add(product);
        }
    }
    public int size(){
        int result = 0;
        for (Product product: products) {
            result++;
        }
        return result;
    }

    public void getSortedListProducts(List<Product> products) {
        Collections.sort(products, (p1, p2) -> p1.getCost() - p2.getCost());
    }

    public List<Product> getSortedListProducts() {
        for (int i = 0; i < products.size() -1; i++) {
            for (int j = 0; j < products.size() - i - 1; j++) {
                if (products.get(j).getCost() > products.get(j + 1).getCost()) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
            return products;
    }

    public Product getMostExpensiveProduct(){
        Product temp = products.get(0);
        for (Product product : products) {
            if (temp == null || product.getCost() > temp.getCost()) {
                temp = product;
            }
        }
        return temp;
    }

    public String toString() {
        return "Product: " + this.products;
    }
}
