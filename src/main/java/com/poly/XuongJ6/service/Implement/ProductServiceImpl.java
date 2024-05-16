package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.request.ProductBrandRequest;
import com.poly.XuongJ6.repository.ProductRepository;
import com.poly.XuongJ6.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String addProduct(ProductBrandRequest product) {
        try {
            productRepository.addProduct(product);
            return "Thêm product thành công";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Thêm product thất bại";
        }

    }

    @Override
    public Integer getProductId(ProductBrandRequest product) {
        return productRepository.findProduct(product);
    }
}
