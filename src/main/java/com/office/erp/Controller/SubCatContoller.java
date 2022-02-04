package com.office.erp.Controller;

import java.util.List;
import java.util.Optional;

import com.office.erp.Dao.SubCatRepo;
import com.office.erp.Entity.SubCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubCatContoller {

    @Autowired
    private SubCatRepo subCatRepo;

    @GetMapping("/scat")
    public List<SubCategory> getSCat(){

        return (List<SubCategory>) subCatRepo.findAll();
    }

    @GetMapping("/scat/{id}")
    public Optional<SubCategory> gCategory(@PathVariable("id") String id){

        return subCatRepo.findById(id); 
    }


    @PostMapping("/scat")
    public SubCategory saveSCat(@RequestBody SubCategory sCategory){

        String id = subCatRepo.findscatId();
        sCategory.setScatId(id);
        sCategory.setCreateDate(java.time.LocalDate.now());
        return subCatRepo.save(sCategory);
    }


    @PutMapping("/scat/{id}")
    public SubCategory updaCat(@PathVariable("id") String id, @RequestBody SubCategory sCategory){

        SubCategory s = subCatRepo.findById(id).get();
        if(sCategory.getScatName()!=null){
            s.setScatName(sCategory.getScatName());
        }
        return  subCatRepo.save(s);
    }


    
}
