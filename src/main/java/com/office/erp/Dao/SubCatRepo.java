package com.office.erp.Dao;

import com.office.erp.Entity.SubCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubCatRepo extends JpaRepository<SubCategory, String> {


    @Query(value="select concat('SCAT',REPLICATE(0,4-len(isNull(max(cast(convert(varchar,substring(scat_id,5,15))as int)),1)+1)),isNull(max(cast(convert(varchar, substring(scat_id, 5, 15)) as int)),0)+1) from sub_category" , nativeQuery = true) 
    public String findscatId();
    
}
