package com.hr.services;

import com.hr.model.Department;
import com.hr.repositories.DepartmentRepository;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDeptById(long id) {
        return departmentRepository.findById(id).orElseThrow(null);
    }


    public void addDept(Department Department) {
        departmentRepository.save(Department);
    }

    public void updateDept(Department Department) {
        departmentRepository.save(Department);
    }

    public void deleteDept(long id) {
        departmentRepository.deleteById(id);
    }



}
