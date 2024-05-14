package com.poly.XuongJ6.service.Implement;

import com.poly.XuongJ6.model.response.StatusResponse;
import com.poly.XuongJ6.repository.StatusRepository;
import com.poly.XuongJ6.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<StatusResponse> getAll() {
        return statusRepository.getAll();
    }
}
