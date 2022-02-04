package com.office.erp.Entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class CategoryBean {
    

    private String name;
    @Id
    private String categoryCode;
    private boolean disContinue;
    @OneToMany(cascade = CascadeType.ALL)
    private List<CategorySubRelation> categorySubRelations;



    public CategoryBean() {
    }

    

    



    


    public CategoryBean(String name, String categoryCode, boolean disContinue,
            List<CategorySubRelation> categorySubRelations) {
        this.name = name;
        this.categoryCode = categoryCode;
        this.disContinue = disContinue;
        this.categorySubRelations = categorySubRelations;
    }










    public List<CategorySubRelation> getCategorySubRelations() {
        return categorySubRelations;
    }










    public void setCategorySubRelations(List<CategorySubRelation> categorySubRelations) {
        this.categorySubRelations = categorySubRelations;
    }










    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public boolean isDisContinue() {
        return disContinue;
    }

    public void setDisContinue(boolean disContinue) {
        this.disContinue = disContinue;
    }
    
}