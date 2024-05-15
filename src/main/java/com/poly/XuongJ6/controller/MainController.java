//package com.poly.XuongJ6.controller;
//
//import com.poly.XuongJ6.model.response.StatusResponse;
//import com.poly.XuongJ6.service.Implement.StatusServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class MainController {
//    @Autowired
//    private StatusServiceImpl statusServiceImpl;
//
//    @GetMapping("/index")
//    public String showHome(Model model) {
//        List<StatusResponse> listStatus = statusServiceImpl.getAll();
//        model.addAttribute("listStatus", listStatus);
//        return "index";
//    }
//}
