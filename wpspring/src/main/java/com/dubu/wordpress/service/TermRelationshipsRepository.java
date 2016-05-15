package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpTermRelationshipsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:40
 */
public interface TermRelationshipsRepository extends Repository<WpTermRelationshipsEntity, Long>, JpaRepository<WpTermRelationshipsEntity, Long>,JpaSpecificationExecutor<WpTermRelationshipsEntity> {


}
