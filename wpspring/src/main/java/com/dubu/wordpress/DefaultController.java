package com.dubu.wordpress;

import com.dubu.wordpress.domain.WpCommentsEntity;
import com.dubu.wordpress.domain.WpPostsEntity;
import com.dubu.wordpress.service.CommentsRepository;
import com.dubu.wordpress.service.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 4:28
 */
@Controller
public class DefaultController {

    PostRepository postRepository;
    CommentsRepository commentsRepository;

    @Autowired
    public DefaultController(PostRepository postRepository, CommentsRepository commentsRepository) {
        this.postRepository = postRepository;
        this.commentsRepository = commentsRepository;
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

    @RequestMapping(value = "/wp-comments-post",method = RequestMethod.POST)
    public String wpCommentsPost( @RequestParam Map<String,String> map
           ) {


//        0 = {java.util.LinkedHashMap$Entry@9390} "comment" -> "df"
//        1 = {java.util.LinkedHashMap$Entry@9391} "author" -> "dfg"
//        2 = {java.util.LinkedHashMap$Entry@9392} "email" -> "dfg"
//        3 = {java.util.LinkedHashMap$Entry@9393} "url" -> "dfg"
//        4 = {java.util.LinkedHashMap$Entry@9394} "submit" -> "Post Comment"
//        5 = {java.util.LinkedHashMap$Entry@9395} "comment_post_ID" -> "23"
//        6 = {java.util.LinkedHashMap$Entry@9396} "comment_parent" -> "0"



        WpCommentsEntity wpCommentsEntity = new WpCommentsEntity();
        wpCommentsEntity.setCommentContent(map.get("comment"));
        wpCommentsEntity.setCommentAuthor(map.get("author"));
        wpCommentsEntity.setCommentAuthorEmail(map.get("email"));
        wpCommentsEntity.setCommentAuthorUrl(map.get("url"));
        wpCommentsEntity.setCommentPostId(Long.valueOf(map.get("comment_post_ID")));
        wpCommentsEntity.setCommentParent(Long.valueOf(map.get("comment_parent")));
//        wpCommentsEntity.setCommentAgent("");
//        wpCommentsEntity.setCommentType("");
//        wpCommentsEntity.setUserId(0L);
//        wpCommentsEntity.setCommentApproved("1");

        commentsRepository.save(wpCommentsEntity);
//        return new RedirectView("/asdfad");
        return "redirct:/";
    }
}
