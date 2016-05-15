package com.dubu.wordpress;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 4:28
 */
@Controller
public class DefaultController {

    @RequestMapping("/bb")
    public String bb(){
        return  "bb";
    }

    @RequestMapping("/")
    public String defaultIndex(Map<String, Object> model){

        model.put("nickname","dubuAA");

        return  "/twentyeleven/index";
    }

}
