package com.ro.learn.inventory.repository;

import com.ro.learn.inventory.bean.Inventory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InventoryRepository {
    private Map<Integer, Inventory> inventory;

    public InventoryRepository() {
        inventory = new HashMap<>(10);
        inventory.put(1, new Inventory(1, 100));
        inventory.put(2, new Inventory(2, 100));
        inventory.put(3, new Inventory(3, 100));
        inventory.put(4, new Inventory(4, 100));
        inventory.put(5, new Inventory(5, 100));
        inventory.put(6, new Inventory(6, 100));
        inventory.put(7, new Inventory(7, 100));
        inventory.put(8, new Inventory(8, 100));
        inventory.put(9, new Inventory(8, 100));
        inventory.put(10, new Inventory(8, 100));
    }

    public Inventory get(int productId) {
        return inventory.get(productId);
    }
}
