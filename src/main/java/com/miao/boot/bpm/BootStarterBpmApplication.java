package com.miao.boot.bpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class BootStarterBpmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootStarterBpmApplication.class, args);
    }
    
    @RequestMapping("index")
    public String index() {
    	return "index";
    }
    
    @RequestMapping("page")
    public String page(String page) {
    	return page;
    }
    
}
