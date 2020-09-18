package com.ro.learn.order.service;

import com.ro.learn.order.bean.Price;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(value = "price-service")
public interface PriceService {
    @GetMapping("price-api/price/{productId}")
    Price getPrice(@PathVariable("productId") int productId);
}
