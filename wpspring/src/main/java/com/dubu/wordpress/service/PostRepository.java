package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpPostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:40
 */
public interface PostRepository extends Repository<WpPostsEntity, Long>, JpaRepository<WpPostsEntity, Long>,JpaSpecificationExecutor<WpPostsEntity> {

    List<WpPostsEntity> findByPostType(@Param("post_type") String postType);
}
