package com.project.taxutil.repository;

import com.project.taxutil.entity.TaxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TaxRepository extends JpaRepository<TaxEntity, String> {
    List<TaxEntity> findOneByIsActive(Integer isActive);
}
