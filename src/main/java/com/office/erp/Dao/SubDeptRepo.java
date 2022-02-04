package com.office.erp.Dao;


import com.office.erp.Entity.SubDepartment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubDeptRepo extends JpaRepository<SubDepartment, String> {

    @Query(value="select concat('SDEPT',REPLICATE(0,4-len(isNull(max(cast(convert(varchar,substring(sub_id,6,15))as int)),1)+1)),isNull(max(cast(convert(varchar, substring(sub_id, 6, 15)) as int)),0)+1) from sub_department" , nativeQuery = true) 
    public String findsubId();
        
}
