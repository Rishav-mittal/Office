package com.office.erp.Entity;

import java.time.LocalDate;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CategorySubRelation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String catCode;
    private String scatCode;
    private LocalDate createDate;
    private LocalDate updateDate;
    private Boolean discontinue=false;






    
    @Override
    public String toString() {
        return "CategorySubRelation [catCode=" + catCode + ", createDate=" + createDate + ", discontinue=" + discontinue
                + ", id=" + id + ", scatCode=" + scatCode + ", updateDate=" + updateDate + "]";
    }
    public CategorySubRelation() {
    }
    public CategorySubRelation(String catCode, String scatCode, LocalDate createDate, LocalDate updateDate,
            Boolean discontinue) {
        this.catCode = catCode;
        this.scatCode = scatCode;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.discontinue = discontinue;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCatCode() {
        return catCode;
    }
    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }
    public String getScatCode() {
        return scatCode;
    }
    public void setScatCode(String scatCode) {
        this.scatCode = scatCode;
    }
    public LocalDate getCreateDate() {
        return createDate;
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
    public Boolean getDiscontinue() {
        return discontinue;
    }
    public void setDiscontinue(Boolean discontinue) {
        this.discontinue = discontinue;
    }



    
    
}
