package com.poly.XuongJ6.repository;

import com.poly.XuongJ6.entity.Product;
import com.poly.XuongJ6.model.request.ProductBrandRequest;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = """
            select
                product_id
            from
                product
            where 
                product_name = :#{#product.name} and
                color = :#{#product.color}
            """, nativeQuery = true)
    Integer findProduct(@Param("product") ProductBrandRequest product);


    @Modifying
    @Transactional
    @Query(value = """
            INSERT
            	INTO
            	product (product_name,
            	color,
            	quantity,
            	sell_price,
            	origin_price,
            	sub_cate_id,
            	status_id)
            VALUES ( :#{#product.name},
            :#{#product.color},
            :#{#product.quantity},
            :#{#product.sellPrice},
            :#{#product.originPrice},
            :#{#product.subCateId},
            :#{#product.statusId}
            )
            """, nativeQuery = true)
    void addProduct(@Param("product") ProductBrandRequest product);

}
