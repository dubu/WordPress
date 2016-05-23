package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpPostmetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:40
 */
public interface PostMetaRepository extends Repository<WpPostmetaEntity, Long>, JpaRepository<WpPostmetaEntity, Long>,JpaSpecificationExecutor<WpPostmetaEntity> {


}
