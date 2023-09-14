package classes.ClassStorage;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private int capacity;
    private List<Product> storage;

    public Storage(int capacity) {
        this.capacity = capacity;
        storage = new ArrayList<>();
    }

    public double totalCost() {
        return storage.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
    }

    public void addProduct(Product product) {
        storage.add(product);
    }

    public String getProducts() {
        return "JSON";
    }

}
