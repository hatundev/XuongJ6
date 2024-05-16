package com.poly.XuongJ6.controller;

import com.poly.XuongJ6.model.request.ProductBrandRequest;
import com.poly.XuongJ6.model.response.ProductBrandResponse;
import com.poly.XuongJ6.service.Implement.ProductBrandServiceImpl;
import com.poly.XuongJ6.service.Implement.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductBrandController {

    @Autowired
    private ProductBrandServiceImpl productBrandService;
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/product-brand")
    public List<ProductBrandResponse> getAll(){
        return productBrandService.getAll();
    }

    @DeleteMapping("/product-brand-del/{productID}/{brandId}")
    public void delete(@PathVariable("productID") int productId, @PathVariable("brandId") int brandId){
        productBrandService.delProductBrand(productId, brandId);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProductBrandRequest product){
        productService.addProduct(product);
        productBrandService.addProductBrand(product);
    }

}
