package com.poly.XuongJ6.service;

import com.poly.XuongJ6.model.response.ProductBrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductBrandService {
    List<ProductBrandResponse> getAll();

    void delProductBrand(int productId, int brandId);
}