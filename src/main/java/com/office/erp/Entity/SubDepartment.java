package com.office.erp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SubDepartment {
  
    
    @Id
    private String subId;
    @Column(nullable = false)
    private String subName;
    @Column(nullable = false)
    private String departmentId;


    public SubDepartment() {
    }

    public SubDepartment(String subName, String departmentId) {
        this.subName = subName;
        this.departmentId = departmentId;
    }


    public String getSubId() {
        return subId;
    }
    public void setSubId(String subId) {
        this.subId = subId;
    }


    public String getSubName() {
        return subName;
    }
    public void setSubName(String subName) {
        this.subName = subName;
    }


    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    } 

    
}
