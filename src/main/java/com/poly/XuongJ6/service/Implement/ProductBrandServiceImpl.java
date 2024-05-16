package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.request.NewProduct;
import com.poly.XuongJ6.model.response.ProductBrandResponse;
import com.poly.XuongJ6.repository.ProductBrandRepository;
import com.poly.XuongJ6.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBrandServiceImpl implements ProductBrandService {
    @Autowired
    private ProductBrandRepository productBrandRepository;

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Override
    public List<ProductBrandResponse> getAll() {
        return productBrandRepository.getAll();
    }

    @Override
    public void delProductBrand(int productId, int brandId) {
        productBrandRepository.deleteProductBrand(productId, brandId);
    }

    @Override
    public void addProductBrand(NewProduct product) {

        int productId = productServiceImpl.getProductId(product);
        productBrandRepository.addProductBrand(productId, product);
    }


}
