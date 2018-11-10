package ru.vstp.ubm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vstp.ubm.document.DocumentService;

@Controller
public class MainController {

    @Autowired
    DocumentService service;

    @RequestMapping("/")
    public String wellcome() {

        return "index";
    }
}
