package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.request.ProductBrandRequest;
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
    public String delProductBrand(int productId, int brandId) {
        try {
            productBrandRepository.deleteProductBrand(productId, brandId);
            return "Xóa thành công";
        }  catch (Exception e) {
            System.out.println(e.getMessage());
            return "Xóa thất bại";
        }
    }

    @Override
    public String addProductBrand(ProductBrandRequest product) {
        try {
            int productId = productServiceImpl.getProductId(product);
            productBrandRepository.addProductBrand(productId, product);
            return "Thêm product-brand thành công";
        } catch (Exception e) {
            System.out.printf(e.getMessage());
            return "Thêm product-brand thất bại";
        }
    }


}
