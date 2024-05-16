package com.poly.XuongJ6.service.Implement;

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

    @Override
    public List<ProductBrandResponse> getAll() {
        return productBrandRepository.getAll();
    }

    @Override
    public void delProductBrand(int productId, int brandId) {
        try {
            productBrandRepository.deleteProductBrand(productId, brandId);
            System.out.println("Xóa thành công");
        }
        catch (Exception e) {
            System.out.println("Xóa thất bại");
        }
    }
}
