package advanced.collections.arraylist;

import java.util.ArrayList;

public class WebShopApp {
    public static void main(String[] args) {
        ArrayList<Product>products = new ArrayList<>();
        products.add(new Product("Fridge", 100, "fun"));
        products.add(new Product("Radio", 150, "Exciting"));
        products.add(new Product("Fridge", 100, "fun"));

        products.add(2, new Product("fan", 300, "cold"));

//        System.out.println(products);
//        products.remove(new Product("Radio", 150, "Exciting"));
        products.remove(2);
        products.set(2, new Product("Tyre", 500, "Rolling"));

        for(Product product: products){
            System.out.println(product);
        }
        System.out.println("------------");
        System.out.println(products.get(0));
        System.out.println(products.size());
    }
}
