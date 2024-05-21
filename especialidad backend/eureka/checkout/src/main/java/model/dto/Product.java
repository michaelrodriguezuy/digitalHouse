package model.dto;

public class Product {
    private String id;
    private String name;
    private double price;
    private String instance;

    public Product(String id, String name, double price, String instance) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.instance = instance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getInstance() {
        return instance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

}
