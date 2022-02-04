package com.office.erp.Dao;

import java.util.List;

import com.office.erp.Entity.CategorySubRelation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRelationRepo extends JpaRepository<CategorySubRelation, Integer>{

    List<CategorySubRelation> findAllById(String id);
    
}
