package com.ro.learn.order.controller;

import com.ro.learn.order.bean.Inventory;
import com.ro.learn.order.bean.Order;
import com.ro.learn.order.bean.Price;
import com.ro.learn.order.bean.ProductAmount;
import com.ro.learn.order.service.GatewayService;
import com.ro.learn.order.service.InventoryService;
import com.ro.learn.order.service.PriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private static Logger log = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private GatewayService gatewayService;
    //@Autowired
    //private PriceService priceService;
    //@Autowired
    //private InventoryService inventoryService;

    @PostMapping(path = "order")
    public Order order(@RequestBody Order order) {
        log.info("Serving order for product id: " + order.getProductId());
        Price price = gatewayService.getPrice(order.getProductId());
        order.setPrice(price.getPrice());
        order.setValue(order.getQuantity() * price.getPrice());

        ProductAmount productAmount = new ProductAmount(order.getProductId(), order.getQuantity());
        Inventory inventory = gatewayService.deductInventory(order.getProductId(), productAmount);
        order.setAvailableQuantity(inventory.getAmount());

        return order;
    }
}
