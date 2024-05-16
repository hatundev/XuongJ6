package com.poly.XuongJ6.service;

import com.poly.XuongJ6.model.request.ProductBrandRequest;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    String addProduct(ProductBrandRequest product);

    Integer getProductId(ProductBrandRequest product);
}
