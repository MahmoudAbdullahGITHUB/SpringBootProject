package com.hr.controller;

import com.hr.model.Department;
import com.hr.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

    @Autowired
    DepartmentService deptService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return deptService.getAllDepartments();
    }

    @GetMapping("/deptById/{id}")
    public Department getEmpById(@PathVariable long id) {
        return deptService.getDeptById(id);
    }


    @PostMapping("/departments")
    public String addDept(@RequestBody Department department) {
        deptService.addDept(department);
        return "Added Successfully";
    }

    @PutMapping("/departments")
    public String updateDept(@RequestBody Department department) {
        deptService.updateDept(department);
        return "Updated Successfully";
    }

    @DeleteMapping("departments")
    public String deleteDept(@RequestParam long id) {
        deptService.deleteDept(id);
        return "Deleted Successfully";
    }


}
