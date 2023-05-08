package org.example.homework03.task02;

/*
Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        List<Product> products = getProducts();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите сорт товара (первый, второй) : ");
        String setSort = sc.nextLine();

        Double minCost = products.get(0).costProduct;
        for (Product product: products) {
            if((product.sortProduct.equals(setSort)) && (minCost > product.costProduct)) {
                minCost = product.costProduct;

            }
        }
        List<String> minCostProducts = new ArrayList<String>();
        for (Product product: products) {
            if ((product.sortProduct.equals(setSort)) && (product.costProduct.equals(minCost))) {
                minCostProducts.add(product.nameProduct);
            }
        }
        for (int i = 0; i < minCostProducts.size(); i++) {
            System.out.println(minCostProducts.get(i));
        }


        sc.close();

    }

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("name1", "country1", 1.0, 7.0, "первый"));
        products.add(new Product("name2", "country2", 1.5, 2.0, "второй"));
        products.add(new Product("name3", "country3", 2.0, 1.5, "первый"));
        products.add(new Product("name4", "country1", 2.5, 4.0, "второй"));
        products.add(new Product("name5", "country2", 3.0, 5.0, "первый"));
        products.add(new Product("name6", "country3", 3.5, 6.0, "второй"));
        products.add(new Product("name7", "country1", 4.0, 1.5, "первый"));
        products.add(new Product("name8", "country3", 4.5, 8.0, "второй"));
        products.add(new Product("name9", "country3", 5.0, 1.5, "первый"));
        products.add(new Product("name10", "country1", 5.5, 10.0, "второй"));
        return products;
    }
}
