package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.response.BrandResponse;
import com.poly.XuongJ6.repository.BrandRepository;
import com.poly.XuongJ6.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public List<BrandResponse> getAll() {
        return brandRepository.getAll();
    }
}
