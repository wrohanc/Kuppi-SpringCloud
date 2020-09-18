package com.ro.learn.order.service;

import com.ro.learn.order.bean.Inventory;
import com.ro.learn.order.bean.Price;
import com.ro.learn.order.bean.ProductAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "gateway-service")
public interface GatewayService {
    @GetMapping("price-api/price/{productId}")
    Price getPrice(@PathVariable("productId") int productId);

    @PutMapping("inventory-api/inventory/{productId}/deduct")
    Inventory deductInventory(@PathVariable("productId") int productId, @RequestBody ProductAmount productAmount);
}
