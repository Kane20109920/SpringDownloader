package com.kaneService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemplateController {
    @RequestMapping("/view")
    public String imdexTemplate(@RequestParam(value = "name",required = false,defaultValue = "qqq") String name, Model model){
        model.addAttribute("name",name);
        return "index2";
    }
    @RequestMapping("/")
    public String staticIndex(){
        return "forward:/html/index.html";
    }
}
