package com.kane.SpringDownloader.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @RequestMapping("/456")
    public String getIndex(){
        return "123";
    }

}
