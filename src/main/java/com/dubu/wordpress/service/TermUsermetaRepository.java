package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpUsermetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:40
 */
public interface TermUsermetaRepository extends Repository<WpUsermetaEntity, Long>, JpaRepository<WpUsermetaEntity, Long>,JpaSpecificationExecutor<WpUsermetaEntity> {


}
