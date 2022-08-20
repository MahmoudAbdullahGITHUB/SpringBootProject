package com.hr.services;

import com.hr.model.Employee;
import com.hr.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;


    public List<Employee> getDeptEmps(long deptId){
        return employeesRepository.findByDepartmentId(deptId);
    }

    public List<Employee> getAllEmployees() {
        return employeesRepository.findAll();
    }

    public Employee getEmployee(long id) {
        return employeesRepository.findById(id).orElseThrow(null);
    }

    public List<Employee> getEmpByFirstName(String firstName) {
        return employeesRepository.findByFirstNameIgnoreCase(firstName);
    }

    public List<Employee> getEmpSearch(String firstName, String lastName) {
        return employeesRepository.empSearch(firstName, lastName);
    }

    public void addEmp(Employee employee) {
        employeesRepository.save(employee);
    }

    public void updateEmp(Employee employee) {
        employeesRepository.save(employee);
    }

    public void deleteEmp(long id) {
        employeesRepository.deleteById(id);
    }



}
