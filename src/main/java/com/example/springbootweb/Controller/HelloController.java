package com.example.springbootweb.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author 79367
 */
@Controller
public class HelloController {

    /*@RequestMapping({"/","/login.html "})
    public String index(){
        return "login";
    }*/

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","a");
        return "success";
    }
}
