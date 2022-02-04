package com.office.erp.Controller;

import java.util.List;

import com.office.erp.Dao.CatRelationRepo;
import com.office.erp.Entity.CategorySubRelation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class CatRelationController {
    

    @Autowired
    private CatRelationRepo catRelationRepo;

    @GetMapping("/catRelation")
    public List<CategorySubRelation> getRE(){

            return catRelationRepo.findAll();
    }

   

    @PostMapping("/catRelation/{id}")
    public CategorySubRelation addCat(@RequestBody CategorySubRelation[] cRelation, @PathVariable("id") String id){
        CategorySubRelation d = null;
        for(int i=0; i<cRelation.length;i++){
            d = cRelation[i];
            d.setCatCode(id);
            d.setCreateDate(java.time.LocalDate.now());
            d.setScatCode(cRelation[i].getScatCode());
            catRelationRepo.save(d);
            }
           return d; 
    }


    @PutMapping("catRelation/{id}")
    public CategorySubRelation updateCat(@RequestBody CategorySubRelation cRE, @PathVariable("id") int id   ){

        CategorySubRelation c = catRelationRepo.findById(id).get();
        if(cRE.getScatCode()!=null){

            c.setScatCode(cRE.getScatCode());
        }
        c.setUpdateDate(java.time.LocalDate.now());
        return catRelationRepo.save(c);


    }
   

}
