package com.poly.XuongJ6.controller;


import com.poly.XuongJ6.model.response.StatusResponse;
import com.poly.XuongJ6.service.Implement.StatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusController {
    @Autowired
    StatusServiceImpl statusService;

    @GetMapping("/status")
    public List<StatusResponse> getAll(){
        return statusService.getAll();
    }
}
