package com.kane.SpringDownloader.RestController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @RequestMapping("/")
    public String getIndex(){
        return "forward:/html/index2.html";
    }



}
