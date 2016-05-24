package com.dubu.wordpress;

import com.dubu.wordpress.domain.WpPostsEntity;
import com.dubu.wordpress.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 4:28
 */
@Controller
public class DefaultController {

    PostRepository postRepository;

    @Autowired
    public DefaultController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/bb")
    public String bb() {
        return "bb";
    }

    @RequestMapping("/")
    public String home(Map<String, Object> model, @RequestParam(required = false) Long p) {

        if (p != null) {
            final WpPostsEntity one = postRepository.findOne(p);
            model.put("post", one);
            return "/twentyeleven/single";
        }
        model.put("nickname", "dubuAA");
        model.put("posts", postRepository.findByPostStatusAndPostTypeOrderByIdDesc("publish", "post"));
        return "/twentyeleven/index";

    }
}
