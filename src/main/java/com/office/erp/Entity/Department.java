package com.office.erp.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Department {
    
    

    @Id
    private String deptId;
    @Column(nullable = false)
    private String deptName;
    @Column(nullable = false)
    private LocalDate createDate;
    private LocalDate updateDate;
    private boolean discontinue = false;
    @OneToMany(cascade = CascadeType.ALL)
    private List<SubDepartment> subDepartment;




    public Department() {
    }

    public Department(String deptId, String deptName, LocalDate createDate, LocalDate updateDate, boolean discontinue,
            List<SubDepartment> subDepartment) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.discontinue = discontinue;
        this.subDepartment = subDepartment;
    }


    public LocalDate getCreateDate() {
        return createDate;
    }
    public boolean isDiscontinue() {
        return discontinue;
    }


    public void setDiscontinue(boolean discontinue) {
        this.discontinue = discontinue;
    }
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }


    public LocalDate getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }


    public String getDeptId() {
        return deptId;
    }
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }


    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public List<SubDepartment> getSubDepartment() {
        return subDepartment;
    }
    public void setSubDepartment(List<SubDepartment> subDepartment) {
        this.subDepartment = subDepartment;
    }




}
