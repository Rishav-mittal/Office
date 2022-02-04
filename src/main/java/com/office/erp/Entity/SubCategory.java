package com.office.erp.Entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubCategory {

    @Id
    private String scatId;
    private String scatName;
    private LocalDate createDate;
    private LocalDate updateDate;
    private Boolean disconti=false;






    
    public SubCategory() {
    }







    public SubCategory(String scatId, String scatName, LocalDate createDate, LocalDate updateDate, Boolean disconti) {
        this.scatId = scatId;
        this.scatName = scatName;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.disconti = disconti;
    }







    public String getScatId() {
        return scatId;
    }







    public void setScatId(String scatId) {
        this.scatId = scatId;
    }







    public String getScatName() {
        return scatName;
    }







    public void setScatName(String scatName) {
        this.scatName = scatName;
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







    public Boolean getDisconti() {
        return disconti;
    }







    public void setDisconti(Boolean disconti) {
        this.disconti = disconti;
    }







    @Override
    public String toString() {
        return "SubCategory [createDate=" + createDate + ", disconti=" + disconti + ", scatId=" + scatId + ", scatName="
                + scatName + ", updateDate=" + updateDate + "]";
    }






    
    
}
