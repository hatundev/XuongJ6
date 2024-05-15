package com.poly.XuongJ6.repository;

import com.poly.XuongJ6.entity.Category;
import com.poly.XuongJ6.model.response.CateResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CateRepository extends JpaRepository<Category, Integer> {

    @Query(value = """
            select cate_id as 'cateId',cate_name as 'cateName' from category
            """, nativeQuery = true)
    public List<CateResponse> getAll();
}
