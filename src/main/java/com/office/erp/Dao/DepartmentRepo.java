package com.office.erp.Dao;

import com.office.erp.Entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepo extends JpaRepository<Department, String> {

    @Query(value="select concat('DEPT',REPLICATE(0,4-len(isNull(max(cast(convert(varchar,substring(dept_id,5,15))as int)),1)+1)),isNull(max(cast(convert(varchar, substring(dept_id, 5, 15)) as int)),0)+1) from department" , nativeQuery = true) 
    public String finddeptId();


    
}
