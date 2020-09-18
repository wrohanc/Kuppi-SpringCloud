package com.ro.learn.inventory.controller;

import com.ro.learn.inventory.bean.Inventory;
import com.ro.learn.inventory.bean.ProductAmount;
import com.ro.learn.inventory.exception.ItemNotAvailableException;
import com.ro.learn.inventory.repository.InventoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {
    private static Logger log = LoggerFactory.getLogger(InventoryController.class);
    @Autowired
    private InventoryRepository inventoryRepository;

    @PutMapping("inventory/{productId}/deduct")
    public Inventory deduct(@PathVariable int productId, @RequestBody ProductAmount productAmount) {
        log.info("Serving inventory for product id: " + productId);
        Inventory inventory = inventoryRepository.get(productId);
        if (inventory != null && inventory.getAmount() >= productAmount.getQuantity()) {
            inventory.deduct(productAmount.getQuantity());
            return inventory;
        }
        throw new ItemNotAvailableException("id : " + productId + " available quantity : " + inventory.getAmount() + " requested quantity : " + productAmount.getQuantity());
    }
}
