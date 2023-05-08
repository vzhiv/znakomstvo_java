package org.example.homework03.task02;

public class Product {
    String nameProduct;
    String countryProduct;
    Double weightProduct;
    Double costProduct;
    String sortProduct;

    public Product(String nameProduct, String countryProduct, Double weightProduct, Double costProduct, String sortProduct) {
        this.nameProduct = nameProduct;
        this.countryProduct = countryProduct;
        this.weightProduct = weightProduct;
        this.costProduct = costProduct;
        this.sortProduct = sortProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", countryProduct='" + countryProduct + '\'' +
                ", weightProduct=" + weightProduct +
                ", costProduct=" + costProduct +
                ", sortProduct='" + sortProduct + '\'' +
                '}';
    }
}
