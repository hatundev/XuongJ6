package com.poly.XuongJ6.service;

import com.poly.XuongJ6.model.request.NewProduct;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    void addProduct(NewProduct product);

    Integer getProductId(NewProduct product);
}
