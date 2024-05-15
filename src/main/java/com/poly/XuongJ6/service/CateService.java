package com.poly.XuongJ6.service;

import com.poly.XuongJ6.model.response.CateResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CateService {
    List<CateResponse> getAll();
}
