package com.dubu.wordpress;

import com.dubu.wordpress.domain.WpPostsEntity;
import com.dubu.wordpress.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 4:28
 */
@Controller
public class DefaultController {


    PostRepository  postRepository;

    @Autowired
    public DefaultController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/bb")
    public String bb(){
        return  "bb";
    }

    @RequestMapping("/")
    public String defaultIndex(Map<String, Object> model){


//        String type = "post";
//        List<WpPostsEntity> lists = postRepository.findByPostType(type);


        model.put("nickname","dubuAA");

        return  "/twentyeleven/index";
    }

}
