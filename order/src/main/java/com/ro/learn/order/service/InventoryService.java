package com.ro.learn.order.service;

import com.ro.learn.order.bean.Inventory;
import com.ro.learn.order.bean.ProductAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//@FeignClient(value = "inventory-service")
public interface InventoryService {
    @PutMapping("inventory-api/inventory/{productId}/deduct")
    Inventory deductInventory(@PathVariable("productId") int productId, @RequestBody ProductAmount productAmount);
}
