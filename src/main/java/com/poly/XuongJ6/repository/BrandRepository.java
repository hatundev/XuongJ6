package com.poly.XuongJ6.repository;

import com.poly.XuongJ6.entity.Brand;
import com.poly.XuongJ6.model.response.BrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    @Query(value = """
            Select brand_id as 'brandId', brand_name as 'brandName' from brand
            """, nativeQuery = true)
    List<BrandResponse> getAll();
}
