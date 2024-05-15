package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.response.CateResponse;
import com.poly.XuongJ6.repository.CateRepository;
import com.poly.XuongJ6.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateServiceImpl implements CateService {
    @Autowired
    private CateRepository cateRepository;

    @Override
    public List<CateResponse> getAll() {
        return cateRepository.getAll();
    }
}
