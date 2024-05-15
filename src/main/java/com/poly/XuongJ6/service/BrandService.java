package com.poly.XuongJ6.service;

import com.poly.XuongJ6.model.response.BrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<BrandResponse> getAll();
}
