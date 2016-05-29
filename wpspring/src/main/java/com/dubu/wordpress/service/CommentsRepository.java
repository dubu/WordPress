package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpCommentsEntity;
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
public interface CommentsRepository extends Repository<WpCommentsEntity, Long>, JpaRepository<WpCommentsEntity, Long>,JpaSpecificationExecutor<WpCommentsEntity> {

    List<WpCommentsEntity> findByCommentPostId(@Param("commentPostId") Long commentPostId);
}
