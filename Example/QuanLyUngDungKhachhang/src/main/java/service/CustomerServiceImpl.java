package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl  implements CustomerService{

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Phong", "ndphong165@gmail.com", "Quảng Ninh"));
        customers.put(1, new Customer(2, "Lương", "luong@gmail.com", "Bắc Ninh"));
        customers.put(1, new Customer(3, "Bảnh", "banh@gmail.com", "Mê Linh"));
        customers.put(1, new Customer(4, "Huy", "huy@gmail.com", "Thái Bình"));
        customers.put(1, new Customer(5, "Hân", "han@gmail.com", "Ninh Bình"));
        customers.put(1, new Customer(6, "Hằng", "hang@gmail.com", "Thanh Hóa"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
