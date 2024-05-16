package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.request.NewProduct;
import com.poly.XuongJ6.repository.ProductRepository;
import com.poly.XuongJ6.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(NewProduct product) {
        productRepository.addProduct(product);
    }

    @Override
    public Integer getProductId(NewProduct product) {
        return productRepository.findProduct(product);
    }
}
