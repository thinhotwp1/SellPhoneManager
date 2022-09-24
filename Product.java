/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sellphonemanager;

/**
 *
 * @author onthi
 */
public class Product {
    private String id,name;
    private double price;
    private String describe;
    private int sellNumber;

    public Product() {
    }

    public Product(String id, String name, double price, String describe, int sellNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.sellNumber = sellNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getSellNumber() {
        return sellNumber;
    }

    public void setSellNumber(int sellNumber) {
        this.sellNumber = sellNumber;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", describe=" + describe + ", sellNumber=" + sellNumber + '}';
    }
    
    
}
