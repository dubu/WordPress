package com.dubu.wordpress.service;

import com.dubu.wordpress.domain.WpOptionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * User: kingkingdubu
 * Date: 2016-05-15
 * Time: 오후 5:40
 */
public interface OptionsRepository extends Repository<WpOptionsEntity, Long>, JpaRepository<WpOptionsEntity, Long>,JpaSpecificationExecutor<WpOptionsEntity> {


    WpOptionsEntity findByOptionName(@Param("optionName") String optionName);
}
