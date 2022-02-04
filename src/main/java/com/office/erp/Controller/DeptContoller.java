package com.office.erp.Controller;

import java.util.List;
import java.util.Optional;

import com.office.erp.Dao.DepartmentRepo;
import com.office.erp.Dao.SubDeptRepo;
import com.office.erp.Entity.Department;
import com.office.erp.Entity.SubDepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptContoller {
    

    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private SubDeptRepo subDeptRepo;


    @GetMapping("/department")
    public List<Department> getUser(){

        return (List<Department>) departmentRepo.findAll();
        

    }


    @GetMapping("/department/{id}")
    public Optional<Department> getdept(@PathVariable("id") String id){
        return departmentRepo.findById(id);
    }


    @PostMapping("/department")
    public void addUser(@RequestBody Department depart) {
        System.out.println(subDeptRepo.findsubId());
        String deptId = departmentRepo.finddeptId();
        depart.setDeptId(deptId);
        depart.setCreateDate(java.time.LocalDate.now());
        List<SubDepartment> sdept = depart.getSubDepartment();
        
        for(int i=0;i<sdept.size();i++){
            sdept.get(i).setDepartmentId(deptId);
            sdept.get(i).setSubId(subDeptRepo.findsubId());
            System.out.println(subDeptRepo.findsubId());
            subDeptRepo.save(sdept.get(i));
        }
        
        departmentRepo.save(depart);
        
       
    }


    @PutMapping("/department/{id}")
    public Department updateDept(@RequestBody Department department, @PathVariable("id") String id){

        Department d = departmentRepo.findById(id).get();
        d.setUpdateDate(java.time.LocalDate.now());
        List<SubDepartment> m = department.getSubDepartment();
        if(department.getDeptName()!=null){
            d.setDeptName(department.getDeptName());
        }
       

        if(m!=null){

            for(int i=0;i<m.size();i++){
               
                String num = m.get(i).getSubId();
                String name = m.get(i).getSubName();
                SubDepartment p = subDeptRepo.findById(num).get();
                if(m.get(i).getSubName()!=null){
                    p.setSubName(name);
                    subDeptRepo.save(p);
                }


                
            }


            
        }
        return departmentRepo.save(d);
      
        
    }



}
