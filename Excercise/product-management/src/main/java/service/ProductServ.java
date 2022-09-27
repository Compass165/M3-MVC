package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductServ implements ProductService{

    HashMap<Integer, Product> productHashMap;

    public ProductServ () {
        productHashMap = new HashMap<>();
        this.add(new Product("Bánh mỳ", 15000, "Hà Nội"));
        this.add(new Product("Phở bò", 35000, "Nam Định"));
        this.add(new Product("Bún bò Huế", 450000, "Huế"));
        this.add(new Product("Bánh canh", 25000,"Tiền Giang"));
        this.add(new Product("Bánh Cu Đơ", 30000, "Hà Tĩnh"));
        this.add(new Product("Chè Thái Nguyên", 100000, "Thái Nguyên"));
    }


    @Override
    public ArrayList<Product> list() {
        return new ArrayList<Product>(productHashMap.values());
    }

    @Override
    public boolean delete(int code) {
        try {
            productHashMap.remove(code);
            return true;
        } catch (Throwable a) {
            return false;
        }
    }

    @Override
    public boolean add(Product product) {
        if (productHashMap.containsKey(product.getCode())) {
            return false;
        }
        productHashMap.put(product.getCode(), product);
        return true;
    }

    @Override
    public boolean update(int code, Product product) {
        if (productHashMap.containsKey(product.getCode())) {
            return true;
        }
        return false;
    }

    @Override
    public Product find(int code) {
        if (productHashMap.containsKey(code)) {
            return productHashMap.get(code);
        }
        return null;
    }
}
