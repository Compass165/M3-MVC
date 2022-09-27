package model;

public class Product {

    private int code;
    String name;
    double price;
    String origin = "chưa rõ";
    String avatar;

    private int randomId() {
        return (int) (Math.random() * 10000 + 10000);
    }

    public Product() {
    }

    public Product(String name, double price, String origin, String avatar) {
        this.code = randomId();
        this.name = name;
        this.origin = origin;
        this.avatar = avatar;
    }

    public Product(int code, String name, double price, String origin, String avatar) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.avatar = avatar;
    }

    public Product (int code, String name, double price, String origin) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.origin = origin;
    }

    public Product (String name, double price) {
        this.code= randomId();
        this.name = name;
        this.price = price;
    }

    public Product (int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() { return code; }

    public void setCode(int code) {
        this.code = code;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setAvatar (String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }
}
