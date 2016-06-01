package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpPostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:40
 */
public interface PostRepository extends Repository<WpPostsEntity, Long>, JpaRepository<WpPostsEntity, Long>,JpaSpecificationExecutor<WpPostsEntity> {

    List<WpPostsEntity> findByPostStatusAndPostTypeOrderByIdDesc(@Param("post_status") String postStatus ,@Param("post_type") String postType );

    @Query("SELECT wp_posts  FROM  WpPostsEntity wp_posts  WHERE 1=1  AND (((wp_posts.postTitle LIKE '%블로그%') OR (wp_posts.postExcerpt LIKE '%블로그%') OR (wp_posts.postContent LIKE '%블로그%')))  AND (wp_posts.postPassword = '')  AND wp_posts.postType IN ('post', 'page', 'attachment') AND (wp_posts.postStatus = 'publish')  ORDER BY wp_posts.postTitle DESC, wp_posts.postDate ")
    List<WpPostsEntity> findSearch(@Param("search") String searchParam);
}
