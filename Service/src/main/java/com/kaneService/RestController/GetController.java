package com.kaneService.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @RequestMapping("/rest")
    public String getIndex(){
        return "forward:/html/index2.html";
    }



}
