package com.poly.XuongJ6.controller;

import com.poly.XuongJ6.model.response.ProductBrandResponse;
import com.poly.XuongJ6.service.Implement.ProductBrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductBrandController {

    @Autowired
    private ProductBrandServiceImpl productBrandService;

    @GetMapping("/product-brand")
    public List<ProductBrandResponse> getAll(){
        return productBrandService.getAll();
    }

    @DeleteMapping("/product-brand-del/{productID}/{brandId}")
    public void delete(@PathVariable("productID") int productId, @PathVariable("brandId") int brandId){
        productBrandService.delProductBrand(productId, brandId);
    }
}
