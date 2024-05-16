package com.poly.XuongJ6.repository;

import com.poly.XuongJ6.entity.ProductBrand;
import com.poly.XuongJ6.entity.ProductBrandId;
import com.poly.XuongJ6.model.response.ProductBrandResponse;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductBrandRepository extends JpaRepository<ProductBrand, ProductBrandId> {

    @Query(value = """
            select
            	product.product_id as 'productId',
            	brand.brand_id as 'brandId',
            	product_name as 'productName',
            	description as 'productDescription',
            	color as 'productColor',
            	sell_price as 'productSellPrice',
            	origin_price as 'productOriginPrice',
            	sub_cate_id as 'subCateId',
            	status_id as 'statusId'
            from
            	product_brand
            join brand on
            	product_brand.brand_id = brand.brand_id
            join product on
            	product.product_id = product_brand.product_id
            """, nativeQuery = true)
    List<ProductBrandResponse> getAll();

    @Modifying
    @Transactional
    @Query(value = """
            Delete from product_brand where product_id = ?1 and brand_id = ?2
            """, nativeQuery = true)
    void deleteProductBrand(int productId, int brandId);
}
